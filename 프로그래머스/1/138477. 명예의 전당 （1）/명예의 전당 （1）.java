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
        
        // 최소 힙
//         PriorityQueue<Integer> heap = new PriorityQueue<>(); // 최소 힙
//         int[] result = new int[score.length];

//         for (int i = 0; i < score.length; i++) {
//             heap.add(score[i]); // 점수 추가

//             if (heap.size() > k) {
//                 heap.poll(); // heap 크기 k 유지 (루트 제거)
//             }

//             result[i] = heap.peek(); // 루트값 = 현재 상위 k점 최솟값
//         }

//         return result;
    }
}