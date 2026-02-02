import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer, Integer> map = new HashMap<>();
        
        int distance = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            distance = Math.abs(n - numlist[i]);
            map.put(numlist[i], distance); 
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        // distance 오름차순, distance 같으면 key 내림차순
        list.sort((a, b) -> {
            int diff = map.get(a) - map.get(b); // distance 오름차순
            if(diff == 0) {
                return b - a; // distance 같으면 큰 수 먼저
            }
            return diff;
        });
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
      
        return answer;
    }
}