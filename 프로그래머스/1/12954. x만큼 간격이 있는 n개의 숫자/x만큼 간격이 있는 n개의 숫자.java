class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 1;
        
        while (idx <= n) {
            long res = (long) x * idx;
            answer[idx-1] = res;    
            idx ++;
        }
    
        return answer;
    }
}