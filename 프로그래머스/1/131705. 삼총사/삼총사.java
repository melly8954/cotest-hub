import java.util.*;

class Solution {
    public int solution(int[] number) {
//         int cnt = 0;
        
//         for (int i = 0; i < number.length - 2; i++) {
//             for (int j = i + 1; j < number.length - 1; j++) {
//                 for (int k = j + 1; k < number.length; k++) {
//                     if (number[i] + number[j] + number[k] == 0) {
//                         cnt ++;
//                     }
//                 }
//             }
//         }
        
//         return cnt;
        
        
        // 다른 풀이 
        return combination(number, 0, 0, 0);
    }
    
     private int combination(int[] number, int index, int limit, int sum) {
        if (limit == 3) {
            return sum == 0 ? 1 : 0;
        }

        int count = 0;
        for (int i = index; i < number.length; i++) {
            count += combination(number, i + 1, limit + 1, sum + number[i]);
        }
        return count;
    }
}