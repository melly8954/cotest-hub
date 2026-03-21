import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] maze;
    static int[][] dist;

    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        dist[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int curX = now[0];
            int curY = now[1];

            // 목적지(n, m)에 도착했다면 즉시 거리 반환
            if (curX == n - 1 && curY == m - 1) {
                return dist[curX][curY];
            }

            for (int d = 0; d < 4; d++) {
                int nowX = curX + moveX[d];
                int nowY = curY + moveY[d];

                // 조건 체크
                if ((nowX >= 0 && nowX < n && nowY >= 0 && nowY < m)
                        && maze[nowX][nowY] == 1 && dist[nowX][nowY] == 0) {
                    dist[nowX][nowY] = dist[curX][curY] + 1;
                    queue.offer(new int[]{nowX, nowY});
                }
            }
        }

        return 0;
    }
}
