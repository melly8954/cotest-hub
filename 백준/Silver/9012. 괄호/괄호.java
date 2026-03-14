import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int idx = 0; idx < T; idx++) {
            String input = br.readLine();

            Stack<Character> stack = new Stack<>();
            boolean check = true;

            for (int i = 0; i < input.length(); i++) {
                if ('(' == input.charAt(i)) {
                    stack.push(input.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty() && check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}