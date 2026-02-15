class Solution {
    public int solution(int num) {
        long n = num;
        int idx = 0;
        
        if (num == 1) {
            return 0;
        }
        
        while (n != 1) {
            if (idx > 500) {
                return -1;
            }
            
            if (n % 2 == 0) {
                n /= 2;
                idx ++;
            } else {
                n = n * 3 + 1;
                idx ++;
            }     
        }
        
        return idx;
    }
}