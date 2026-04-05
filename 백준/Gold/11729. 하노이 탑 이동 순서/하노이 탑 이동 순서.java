import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1. 이동 횟수 출력
        System.out.println((int) Math.pow(2, n) - 1);

        // 2. 이동 과정
        hanoi(n, 1, 2, 3);

        // 3. 결과 출력
        System.out.print(sb);
    }

    static void hanoi(int n, int start, int mid, int end) {
        // n개를 start → end로 옮기는 과정
        if (n == 1) {
            // 더 쪼갤 수 없으면 바로 이동
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        // 1. n-1개를 잠깐 mid로 옮긴다 (큰 원판 꺼내기)
        hanoi(n - 1, start, end, mid);

        // 2. 가장 큰 원판을 목적지로 이동
        sb.append(start).append(" ").append(end).append("\n");

        // 3. mid에 있던 것들을 다시 end로 옮긴다
        hanoi(n - 1, mid, start, end);
    }
}