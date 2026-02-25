class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);

    if (ch == ' ') {
        sb.append(' ');
        index = 0;
    } else {
        if (index % 2 == 0) {
            sb.append(Character.toUpperCase(ch));
        } else {
            sb.append(Character.toLowerCase(ch));
        }
        index++;
    }
}
        
        return sb.toString();
    }
}