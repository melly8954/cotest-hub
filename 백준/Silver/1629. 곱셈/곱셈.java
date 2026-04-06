import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(moduler(A, B));
    }

    static long moduler(long A, long B){
        if (B == 1) {
            return A % C;
        }

        // 분할 정복 (지수 법칙 활용 -> 지수는 쪼갤 수 있다.)
        long div = moduler(A, B / 2);

        // 지수(B)가 짝수
        if (B % 2 == 0) {
            // 나머지 연산 성질 (모듈러 성질)
            return (div * div) % C;
        } else {
            return ((div * div) % C) * A % C;
        }
    }
}