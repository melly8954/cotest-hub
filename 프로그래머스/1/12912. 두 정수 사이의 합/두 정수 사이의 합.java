class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int i = 0;
        int j = 0;
        
        if (a > b) {
            i = b;
            j = a;
        } else if (a < b) {
            i = a;
            j = b;
        } else {
            return a;
        }
        
        for (int idx = i; idx <= j; idx++) {
            sum += idx;
        }
        
        return sum;
    }
}