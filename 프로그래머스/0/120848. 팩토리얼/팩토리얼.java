class Solution {
    public int solution(int n) {
        int fac = 1;
        
        int cnt = 1;
        
        while(true){
            fac *= cnt;
            
            if(fac > n){
                return cnt-1;
            }
            
            cnt++;
        }
    }
}