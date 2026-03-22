import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int row, col;
    static int[][] field;
    static boolean[][] visited;

    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());   // 세로 길이
        col = Integer.parseInt(st.nextToken());   // 가로 길이

        field = new int[row][col];
        visited = new boolean[row][col];

        int cnt = 0;    // 그림 개수
        int maxArea = 0;   // 그림 넓이

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < col; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 전체 탐색
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (field[i][j] == 1 && !visited[i][j]) {
                    // 1. BFS 풀이
                    // int area = bfs(i,j);

                    // 2. DFS 풀이
                    int area = dfs(i, j);
                    cnt++;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(cnt);
        System.out.println(maxArea);
    }

    /*
        BFS - 연결된 영역을 큐(Queue)로 확장하면서 탐색

        큐(Queue)
            - 앞으로 탐색할 좌표 목록
            - 전체 흐름
                1. 시작점 큐에 넣음 + visited 처리 (중복 방지)
                2. 큐에서 꺼냄
                3. 상하좌우 탐색 (moveX, moveY)
                4. 조건 맞으면 큐에 넣고 방문처리
                5. 큐 빌 때까지 반복 -> 더 이상 갈 수 있는 1이 없음 (현재 그림 탐색 끝)
     */
    static int bfs(int x, int y) {
        // x,y 좌표 한 쌍을 하나의 데이터로 처리하기 때무에 int[]로 큐를 가진다.
        Queue<int[]> queue = new LinkedList<>();
        // enqueue 전에 방문 처리 (중복 삽입 방지)
        visited[x][y] = true;
        queue.offer(new int[]{x, y});

        int area = 1;

        // 더 이상 탐색할 좌표가 없을 때까지 탐색을 의미하는 반복문
        while (!queue.isEmpty()) {
            int[] select = queue.poll();
            // 큐는 배열 형태라서 변수로 뽑아냄
            int currentX = select[0];
            int currentY = select[1];

            // 상하좌우 좌표(4방향) 탐색
            for (int d = 0; d < 4; d++) {
                int nextX = currentX + moveX[d];
                int nextY = currentY + moveY[d];

                // 조건 체크
                if ((nextX >= 0 && nextX < Main.row && nextY >= 0 && nextY < Main.col)
                        && field[nextX][nextY] == 1
                        && !visited[nextX][nextY]) {

                    // 방문 처리 + 큐 추가
                    visited[nextX][nextY] = true;
                    queue.offer(new int[]{nextX, nextY});
                    area++;
                }
            }
        }

        return area;
    }

    /*
        DFS - 연결된 영역을 재귀(Recursion)를 이용해 깊게 탐색

        재귀 호출(Stack 방식)
            - 현재 위치에서 갈 수 있는 한 방향을 정하면 그 방향의 끝까지 파고듦
            - 전체 흐름
                1. 현재 좌표 방문 처리 (visited)
                2. 상하좌우 중 갈 수 있는 곳 발견
                3. 발견하자마자 그 좌표로 자기 자신(dfs)을 다시 호출 (moveX,Y 반복문 인덱스 d 증가시키지 않고 새 dfs 메서드를 실행)
                4. 더 이상 갈 곳이 없으면 이전 단계로 돌아와(Backtracking) 다른 방향 탐색 (이때서야 d 증가)
                5. 모든 연결된 칸을 방문하면 최종 area 합산 반환
     */
    static int dfs(int x, int y) {
        // 현재 좌표 방문 처리
        visited[x][y] = true;

        int area = 1;

        // 상하좌우 탐색
        for (int d = 0; d < 4; d++) {
            int nowX = x + moveX[d];
            int nowY = y + moveY[d];

            // 조건 체크 (경계 밖, 이미 방문, 그림이 아닌 곳(0)은 skip)
            if (nowX < 0 || nowX >= Main.row || nowY < 0 || nowY >= Main.col) continue;
            if (visited[nowX][nowY]) continue;
            if (field[nowX][nowY] == 0) continue;

            // 조건에 맞으면 즉시 해당 칸으로 깊게 탐색 시작
            area += dfs(nowX, nowY);
        }

        return area;
    }
}