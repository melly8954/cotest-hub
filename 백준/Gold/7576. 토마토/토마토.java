import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int row, col;
    static int[][] container;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        container = new int[row][col];
        Queue<Tomato> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                container[i][j] = Integer.parseInt(st.nextToken());

                if (container[i][j] == 1) {
                    queue.offer(new Tomato(i,j));
                }
            }
        }

        bfs(queue);

        int day = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (container[i][j] == 0) {
                    System.out.println(-1);

                    return;
                }

                day = Math.max(day, container[i][j]);
            }
        }

        System.out.println(day - 1);
    }

    static class Tomato {
        int x;
        int y;

        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(Queue<Tomato> queue) {
        while (!queue.isEmpty()) {
            Tomato select = queue.poll();

            int curX = select.x;
            int curY = select.y;

            int[] moveX = new int[] {1, -1, 0, 0};
            int[] moveY = new int[] {0, 0, 1, -1};

            for (int i = 0; i < 4; i++) {
                int nextX = curX + moveX[i];
                int nextY = curY + moveY[i];

                if (nextX < 0 || nextX >= row || nextY < 0 || nextY >= col) {
                    continue;
                }

                if (container[nextX][nextY] == 0) {
                    container[nextX][nextY] = container[curX][curY] + 1;
                    queue.offer(new Tomato(nextX, nextY));
                }
            }
        }
    }
}