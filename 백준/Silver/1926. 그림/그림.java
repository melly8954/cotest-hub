import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] field;
    static boolean[][] visited;

    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());   // 세로 길이
        m = Integer.parseInt(st.nextToken());   // 가로 길이

        field = new int[n][m];
        visited = new boolean[n][m];

        int cnt = 0;    // 그림 개수
        int maxArea = 0;   // 그림 넓이

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 전체 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 1 && !visited[i][j]) {
                    int area = bfs(i,j);
                    cnt++;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(cnt);
        System.out.println(maxArea);
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});

        visited[x][y] = true;

        int area = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int currentX = now[0];
            int currentY = now[1];

            for (int d = 0; d < 4; d++) {
                int nowX = currentX + moveX[d];
                int nowY = currentY + moveY[d];

                // 조건 체크
                if ((nowX >= 0 && nowX < n && nowY >= 0 && nowY < m)
                        && field[nowX][nowY] == 1
                        && !visited[nowX][nowY]) {

                    // 방문 처리 + 큐 추가
                    visited[nowX][nowY] = true;
                    queue.offer(new int[]{nowX, nowY});
                    area++;
                }
            }
        }

        return area;
    }
}