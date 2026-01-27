import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        String[] b_token = before.split("");
        String[] a_token = after.split("");

        Arrays.sort(b_token);
        Arrays.sort(a_token);

        if(Arrays.equals(a_token, b_token)) {
            answer = 1;
        }

        return answer;
    }
}