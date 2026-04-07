import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();
        int sum = 0;
        int starIdx = -1;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);

            if (c == '*') {
                starIdx = i;
                continue;
            }

            int ic = c - '0';

            if (i % 2 != 0) {
                sum += 3 * ic;
            } else {
                sum += ic;
            }
        }

        for (int j = 0; j <= 9; j++) {
            int w = (starIdx % 2 != 0) ? 3 : 1;

            if ((sum + (j * w)) % 10 == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}
