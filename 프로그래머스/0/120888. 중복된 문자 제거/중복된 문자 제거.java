import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < my_string.length(); i++){
            String s = String.valueOf(my_string.charAt(i));
            set.add(s);
        }
        
        for (String s : set) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}