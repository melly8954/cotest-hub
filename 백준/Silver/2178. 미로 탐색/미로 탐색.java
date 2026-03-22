import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int row, col;
    static int[][] maze;
    static int[][] dist;

    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());   // 세로
        col = Integer.parseInt(st.nextToken());   // 가로

        maze = new int[row][col];   // 미로 크기(row * col)
        dist = new int[row][col];   // 해당 구역[row][col]까지의 최소거리

        for (int i = 0; i < row; i++) {
            String s = br.readLine();   // 한줄 읽기
            for (int j = 0; j < col; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        dist[x][y] = 1;
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] select = queue.poll();
            int curX = select[0];
            int curY = select[1];

            // 목적지(y, x)에 도착했다면 즉시 거리 반환
            if (curX == Main.row - 1 && curY == Main.col - 1) {
                return dist[curX][curY];
            }

            // 상하좌우 좌표(4방향) 탐색
            for (int d = 0; d < 4; d++) {
                int nextX = curX + moveX[d];
                int nextY = curY + moveY[d];

                // 조건 체크
                if (nextX < 0 || nextX >= Main.row || nextY < 0 || nextY >= Main.col) continue;

                // 이동 불가 검사
                if (maze[nextX][nextY] == 0) continue;

                // 방문 검사
                if (dist[nextX][nextY] != 0) continue;

                // 거리 갱신 및 큐 추가
                dist[nextX][nextY] = dist[curX][curY] + 1;
                queue.offer(new int[]{nextX, nextY});

            }
        }

        return 0;
    }
}