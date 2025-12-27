import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i<emergency.length; i++){
            int rank = 1;
            
             for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] > emergency[i]) {
                    rank++;
                }
            }

            answer[i] = rank;
            
        }
        
        return answer;
        
        // 정렬 + Map 방식
//         int[] answer = new int[emergency.length];
//         int[] sort = Arrays.copyOf(emergency, emergency.length);
        
//         Arrays.sort(sort);
        
//         Map<Integer, Integer> rank = new HashMap<Integer, Integer>();
//         int rankIdx = 1;
//         for (int idx = sort.length - 1; idx >= 0; idx--) {
//             rank.put(sort[idx], rankIdx);
// 			rankIdx++;
//         }
        
//         for (int idx = 0; idx < emergency.length; idx++) {
//             answer[idx] = rank.get(emergency[idx]);
//         }
        
//         return answer;
    }
}