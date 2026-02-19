import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        // 모든 직선 쌍의 교점을 계산
        for (int i = 0; i < line.length; i++) {
            // j = i + 1로 시작해서
            // 자기 자신(line[i])과 비교하지 않고
            // 이미 계산한 쌍 중복 계산을 방지
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                            line[j][0], line[j][1], line[j][2]);
                
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }
        
        // points 리스트의 모든 교점 중
        // min: x, y 좌표 최소값 → 배열 시작 좌표 기준
        // max: x, y 좌표 최대값 → 배열 크기 결정 기준
        // min/max 좌표를 이용해 별을 찍을 2차원 배열 범위 결정 가능
        Point min = getMinPoint(points);
        Point max = getMaxPoint(points);
        
        int width = (int) (max.x - min.x + 1);
        int height = (int) (max.y - min.y + 1);            
            
        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }
        
        for (Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            
            arr[y][x] = '*';
        }
        
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        
        return result;
    }
    
    // 좌표 객체
    private static class Point {
        private final long x;
        private final long y;
        
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // ax + by + m = 0
    // cx + dy + n = 0 의 두 직선의 교차점
    private Point intersection(long a, long b, long m, long c, long d, long n) {
        long denominator = a*d - b*c;
        if (denominator == 0) {
            return null;  // 교점이 없으므로 null 반환
        }
        
        double x = (double) (n * b) - (m * d) / (a * d - b * c);
        double y = (double) (m * c) - (n * a) / (a * d - b * c);
        
        // 소수점 아래 자리를 확인하는 용도
        // 1로 나눴을 때 소수일 경우 null
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        
        return new Point((long) x, (long) y);
    }
    
    // points 전체에서 x, y 최소값 좌표 계산
    private Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point point : points) {
            if (point.x < x) {
                x = point.x;
            }
            
            if (point.y < y) {
                y = point.y;
            }
        }
        
        return new Point(x, y);
    }
    
    // points 전체에서 x, y 최대값 좌표 계산
    private Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point point : points) {
            if (point.x > x) {
                x = point.x;
            }
            
            if (point.y > y) {
                y = point.y;
            }
        }
        
        return new Point(x,y);
    }
}