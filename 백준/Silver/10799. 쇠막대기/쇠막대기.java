import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        char prev = ' ';


        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' ) {
                stack.push('(');
            } else {
                if (prev == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer += 1;
                }
            }

            prev = current;
        }
        System.out.println(answer);
    }
}
