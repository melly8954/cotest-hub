class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = getGcd(n, m);
        int lcm = getLcm(n, m, gcd);
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    private int getGcd(int n, int m) {
        while (m != 0) {
            int temp = n % m;
            
            n = m;
            m = temp;
        }
        
        return n;
    }
    
    private int getLcm(int n, int m, int gcd) {
        return n * m / gcd ;
    }
}