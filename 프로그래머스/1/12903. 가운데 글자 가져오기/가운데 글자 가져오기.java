class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        char c;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ch.length; i++) {
            
        }
        
        if (s.length() % 2 == 0) {
            c = ch[ch.length / 2 - 1];
            sb.append(c);
            
            c = ch[ch.length / 2];
            sb.append(c);
        } else {
            c = ch[ch.length / 2];
            sb.append(c);
        }
        
        return sb.toString();
    }
}