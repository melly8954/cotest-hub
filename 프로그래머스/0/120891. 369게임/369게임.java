import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        long n = 0;
        
        String str = String.valueOf(order);
        
        for(int i = 0; i < str.length(); i++){
            n = Character.getNumericValue(str.charAt(i)); // str.charAt(i) - '0'
            
            if(n!= 0 && n % 3 == 0){
                answer ++;
            }
        }
        
        return answer;
    }
}