import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int col, row;
    static int[][] field;
    static boolean[][] visited;
    static int[] moveX = {1, -1 , 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int idx = 0; idx < T; idx++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());
            int vegetable = Integer.parseInt(st.nextToken());

            field = new int[col][row];
            visited = new boolean[col][row];
            Queue<Point> queue = new LinkedList<>();

            int cnt = 0;

            for (int i = 0; i < vegetable; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());

                field[x][y] = 1;
            }

            for (int c = 0; c < col; c++) {
                for (int r = 0; r < row; r++) {
                    if (field[c][r] == 1 && visited[c][r] == false) {
                        queue.offer(new Point(c,r));
                        bfs(queue);
                        cnt ++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void bfs(Queue<Point> queue) {
        while(!queue.isEmpty()) {
            Point select = queue.poll();
            int curX = select.x;
            int curY = select.y;

            visited[curX][curY] = true;

            for (int i = 0; i < 4; i++) {
                int nextX = curX + moveX[i];
                int nextY = curY + moveY[i];

                if (nextX < 0 || nextX >= col || nextY < 0 || nextY >= row) {
                    continue;
                }

                if (field[nextX][nextY] != 1) {
                    continue;
                }

                if (visited[nextX][nextY] == true) {
                    continue;
                }

                visited[nextX][nextY] = true;
                queue.offer(new Point(nextX, nextY));
            }
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}