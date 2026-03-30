import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int[] coin = new int[n];
        int size = coin.length;

        for (int i = 0; i < size; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < size; i++) {

            if (k / coin[size - 1 - i] > 0) {
                cnt += k / coin[size - 1 - i];
                k = k % coin[size - 1 - i];
            }
        }

        System.out.println(cnt);
    }
}
