class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        int sum = 0;

        // 11, 7
        int sides_max = Math.max(sides[0], sides[1]);
        int sides_min = Math.min(sides[0], sides[1]);

        // 11 < 7 + n 에서  n이 11까지

        for(int i = sides_max - sides_min + 1; i <= sides_max; i++){
            cnt ++;
        }
        sum += cnt;
        cnt = 0;

        // n < 11 + 7 인데 n이 12부터 시작
        for(int i = sides_max + 1; i < sides_max + sides_min; i++){
            cnt ++;
        }
        
        sum += cnt;

        return sum;
    }
}