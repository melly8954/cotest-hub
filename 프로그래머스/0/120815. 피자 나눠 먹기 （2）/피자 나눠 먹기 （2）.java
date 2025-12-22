class Solution {
    public int solution(int n) {
        int gcd = gcd(6, n);
        
        int x = (6/gcd) * (n/gcd) *gcd;
        
        return x/6;
    }
    
    private int gcd(int a, int b) {
        while(b!=0) {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}