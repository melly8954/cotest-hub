class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
            int d = getDivide(i);
            
            if (d % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        
        return sum;
    }
    
    private int getDivide(int n) {
        int cnt = 0;
        int idx = 1;
        
        while (idx <= n) {
            if (n % idx == 0) {
                cnt ++;
            }
            
            idx ++;
        }
        
        return cnt;
    }
    
}