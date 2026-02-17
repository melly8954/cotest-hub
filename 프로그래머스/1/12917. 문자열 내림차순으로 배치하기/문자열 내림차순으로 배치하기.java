import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        char[] clone = ch.clone();
        
        for (int i = 0; i < clone.length; i++) {
            ch[i] = clone[clone.length - 1 - i];
            
            sb.append(ch[i]);
        }
        
        return sb.toString();
        
        
    }
}