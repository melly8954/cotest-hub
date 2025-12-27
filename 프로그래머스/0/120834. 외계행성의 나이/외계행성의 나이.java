class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strAge.length(); i++) {
            char digitChar = strAge.charAt(i);   
            int digit = digitChar - '0';         
            char alien = (char) ('a' + digit);   
            sb.append(alien);
        }

        return sb.toString();
    }
}