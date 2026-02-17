import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[ch.length - 1 - i]);
        }
        
        return sb.toString();
    }
}