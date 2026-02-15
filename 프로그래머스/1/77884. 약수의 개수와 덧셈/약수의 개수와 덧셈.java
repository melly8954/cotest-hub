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
    
//     private int getDivide(int n) {
//         int cnt = 0;
//         int idx = 1;
        
//         while (idx <= n) {
//             if (n % idx == 0) {
//                 cnt ++;
//             }
            
//             idx ++;
//         }
        
//         return cnt;
//     }
    
    // 완전 제곱 수 방식
    private int getDivide(int n) {
        int cnt = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    cnt++;        // 완전제곱수
                } else {
                    cnt += 2;     // (i, n/i)
                }
            }
        }
    
        return cnt;
    }    
}