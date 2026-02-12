import java.util.*;

class Solution {
    public long solution(long n) {
        String[] token = String.valueOf(n).split("");
        
        Arrays.sort(token);
        String[] copy = Arrays.copyOf(token, token.length);
        
        for (int i = 0; i < token.length; i++) {
            token[i] = copy[copy.length - 1 - i];    
        }
        
        
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < token.length; i++) {
            sb.append(token[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}