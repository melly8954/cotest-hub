class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        int cnt = 0;
        
        while(cnt < k){
            if(idx >= numbers.length){
                idx %= numbers.length;
            }
            answer = numbers[idx];
            idx += 2;
            cnt++;
        }
        
        return answer;
    }
}