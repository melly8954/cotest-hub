class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        String answer = "";

        for (int i = 0; i < strAge.length(); i++) {
            char digitChar = strAge.charAt(i);
            // 2 = 50 - 48
            int digit = digitChar - '0';
            // 'c' = 'a' + 2
            char alien = (char) ('a' + digit);   
            answer += alien;
        }

        return answer;
    }
}