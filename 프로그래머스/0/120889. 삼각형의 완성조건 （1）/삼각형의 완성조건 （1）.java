import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = 0;
        int max = 0;

//         for(int n : sides){
//             sum += n;
//             max = Math.max(n, max);
//         }
        
//         if (sum - max > max){
//             answer = 1;
//         } else{
//             answer = 2;
//         }
        
        List<Integer> list = new ArrayList<>();
        
        for(int n : sides){
            list.add(n);
        }
        
        Collections.sort(list);
        
        max = list.get(2);
        sum = list.get(0) + list.get(1);
        
        if(sum > max){
            answer = 1;
        } else{
            answer = 2;
        }
        
        return answer;
    }
}