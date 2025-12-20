import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        // 기존 풀이
        // int[] answer = new int[numbers.length];
        // for(int i = 0; i<numbers.length; i++){
        //      answer[i] = numbers[i] * 2;
        // }
        // return answer;
        
        
        // 스트림 사용 풀이
        return Arrays.stream(numbers).map(i -> i*2).toArray();                  
    }
}