import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int number : numbers){
            list.add(number);
        }
        
        int max1 = Collections.max(list);
        
        list.remove(Integer.valueOf(max1));
        
        int max2 = Collections.max(list);
        
        answer = max1 * max2;
        
        return answer;
    }
}