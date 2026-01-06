import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> list = new ArrayList<>();
        
        for(String str : strlist){
            int l = str.length();
            list.add(l);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}