import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            
            list = list.stream().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
            
            if (i + 1 < k) {
                result[i] = list.get(list.size() - 1);
            } else {
                result[i] = list.get(k - 1);
            }
        }
        
        return result;
    }
}