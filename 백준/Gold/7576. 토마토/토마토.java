import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int y, x;
    static int[][] container;

    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken()); // 가로
        y = Integer.parseInt(st.nextToken()); // 세로

        container = new int[y][x];

        Queue<int[]> queue = new LinkedList<>();

        // 처음 익어 있는 토마토 구하기
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                container[i][j] = Integer.parseInt(st.nextToken());

                if (container[i][j] == 1) {
                    queue.add(new int[]{i, j}); // 익은 토마토 시작 좌표 큐에 세팅
                }
            }
        }

        bfs(queue);

        int day = 0;

        // 전체 탐색
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                // 익지 못한 토마토가 있으면 실패
                if (container[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                // 매핑된 값 중 가장 큰 값 고르기
                day = Math.max(day, container[i][j]);
            }
        }

        // 0일차 매핑이 1로 되어있기 때문에
        System.out.println(day - 1);
    }

    static void bfs(Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] select = q.poll();
            int curX = select[0];
            int curY = select[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + moveX[i];
                int nextY = curY + moveY[i];

                // 범위 체크
                if (nextX < 0 || nextX >= y || nextY < 0 || nextY >= x) {
                    continue;
                }

                // 안 익은 토마토라면
                if (container[nextX][nextY] == 0) {
                    container[nextX][nextY] = container[curX][curY] + 1;
                    q.add(new int[]{nextX, nextY});
                }
            }
        }
    }
}