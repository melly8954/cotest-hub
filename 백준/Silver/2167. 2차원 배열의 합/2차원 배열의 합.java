import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // i >= 1  j >= 1 (문제 조건 정의)
        int[][] arr = new int[n + 1][m + 1];

        // 배열 저장
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // K 입력
        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int q = 0; q < k; q++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum = 0;

            for (int row = i; row <= x; row++) {
                for (int col = j; col <= y; col++) {
                    sum += arr[row][col];
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
