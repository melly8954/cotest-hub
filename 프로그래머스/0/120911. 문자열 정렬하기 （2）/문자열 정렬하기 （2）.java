import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder("");
        char[] ch = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(ch);
        
        for(char c : ch){
            sb.append(c);
        }
        
        return sb.toString();
    }
}