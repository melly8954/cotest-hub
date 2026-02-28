import java.util.*;

class Solution {
    public int[] solution(String s) { 
        int[] result = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!map.containsKey(ch)) {
                result[i] = -1;
                map.put(ch, i);
            } else {
                int prevIndex = map.get(ch);
                result[i] = i - prevIndex;
                map.put(ch, i);
            }
        }
        
        return result;
    }
}