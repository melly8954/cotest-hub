class Solution {
    public int solution(int n) {
        int idx = 1;
        int sum = 0;
        
        while (n >= idx) {
            if (n % idx == 0) {
                sum += idx;
            }
            
            idx ++;
        }
        
        return sum;
    }
}