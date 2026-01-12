class Solution {
    public int solution(int n) {
        int answer = 2;
        int idx = 2;
        
        while(Math.pow(idx,2) < n){
            idx++;
            
            if(Math.pow(idx,2) == n){
                answer = 1;
            }
        }
        
        return answer;
    }
}