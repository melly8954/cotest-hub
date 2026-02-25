class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (index % 2 == 0) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }

            if (ch == ' ') {
                index = -1;
            }

            sb.append(ch);
            index++;
        }
        
        return sb.toString();
    }
}