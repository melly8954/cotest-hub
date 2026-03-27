import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] check = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int sister = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start,sister));
    }

    static int bfs(int start, int sister) {
        Queue<Location> queue = new LinkedList<>();

        check[start] = true;
        queue.offer(new Location(start, 0));

        while(!queue.isEmpty()) {
            Location select = queue.poll();

            int locate = select.locate;

            if (locate == sister) {
                return select.time;
            }

            int[] nexts = {select.locate - 1, select.locate + 1, select.locate * 2};

            for (int next : nexts) {
                if (next < 0) {
                    continue;
                }

                if (next > 100000) {
                    continue;
                }

                if (check[next]) {
                    continue;
                }

                check[next] = true;
                queue.offer(new Location(next, select.time + 1));
            }
        }

        return -1;
    }

    static class Location {
        int locate;
        int time;

        public Location(int locate, int time) {
            this.locate = locate;
            this.time = time;
        }
    }

}
