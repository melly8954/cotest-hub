class Solution {
    public int solution(int n, int k) {
        int lamb = 12000 * n;
        int drink = 0;
        int d = 0;
        
        d = n/10;
        drink = 2000 * (k-d);
        
        return lamb + drink;
    }
}