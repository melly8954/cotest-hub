class Solution {
    public int solution(int chicken) {
        int service = 0;
        int coupon = 0;
        int total;
        
        while(chicken + coupon > 9) {
            total = chicken + coupon;
            service += total / 10;
            coupon = total % 10;
            chicken = total / 10;
        }    
        
        return service;
    }
}