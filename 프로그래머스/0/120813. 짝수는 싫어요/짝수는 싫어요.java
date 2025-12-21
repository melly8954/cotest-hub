import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(i%2 !=0) {
                list.add(i);
            }
        }
        
        // 기존 방식 (for문 사용하여 배열 생성)
        // int[] answer = new int[list.size()];
        // for(int i=0; i<list.size(); i++) {
        //     answer[i] = list.get(i);
        // }
        
        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}