import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        // long top = 1;
        // long bot = 1;
        // for(int i = 0; i<balls - share; i++){
        //     top *= balls-i;
        //     bot *= (balls - share)-i; 
        // }
        // return (int) (top/bot);
        // 테스트 5 6 7 실패 --> 범위를 넘어가버림 (예시. 30과 1)
        
        // 풀이 참조
//         long answer = 1;
//         for (int i = 1; i <= share; i++) {
//             answer = answer * (balls - i + 1) / i;
//         }
        
//         return (int) answer;
        
        
        // 팩토리얼 풀이
        BigInteger top = factorial(balls);
        BigInteger bottom = factorial(share)
                .multiply(factorial(balls - share));

        return top.divide(bottom).intValueExact();
    }
    
    // 팩토리얼 메서드
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}