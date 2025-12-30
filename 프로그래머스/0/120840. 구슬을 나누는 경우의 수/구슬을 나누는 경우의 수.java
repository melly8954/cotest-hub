class Solution {
    public int solution(int balls, int share) {
        // double answer = 1;
        double top = 1;
        double bot = 1;
        for(int i = 0; i<balls - share; i++){
            top *= balls-i;
            bot *= (balls - share)-i; 
        }
        return (int) (top/bot);
        // 테스트 5 6 7 실패 --> 범위를 넘어가버림 (예시. 30과 1)
        
        // 풀이 참조
//         for (int i = 1; i <= share; i++) {
//             answer = answer * (balls - i + 1) / i;
//         }
        
//         return (int) answer;
    }
}