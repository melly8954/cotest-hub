import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++) {
            answer[i] = num_list[num_list.length-1-i];
        }
        
        return answer;
        
        // 다른 사람 풀이 1
//         List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

//         Collections.reverse(list);
//         return list.stream().mapToInt(Integer::intValue).toArray();
        
        // 다른 사람 풀이 2
        // return IntStream.range(0, num_list.length)
        //                 .map(i -> num_list[num_list.length - 1 - i])
        //                 .toArray();
    }
}