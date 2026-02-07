import java.util.*;

class Solution {
    public int solution(int order) {
        int cnt = 0;
        
        String str = String.valueOf(order);
        
        for(int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            
            if(n == 3 || n == 6 || n == 9) {
                cnt ++;
            }
            
        }
        
        return cnt;
       
//         int answer = 0;
        
//         String str = String.valueOf(order);
        
//         for(int i = 0; i < str.length(); i++){
//             char c = str.charAt(i);
            
//             if(c == '3' || c == '6' || c == '9'){
//                 answer ++;
//             }
//         }
        
//         return answer;
    }
}