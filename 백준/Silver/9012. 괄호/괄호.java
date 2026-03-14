import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int idx = 0; idx < T; idx++) {
            String input = br.readLine();

            int sum = 0;
            boolean check = true;

            for (int i = 0; i < input.length(); i++) {
                if ('(' == input.charAt(i)) {
                    sum ++;
                } else {
                    sum --;

                    if (sum < 0) {
                        check = false;
                    }
                }
            }

            if (sum == 0 && check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}