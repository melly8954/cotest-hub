class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int r_coupon = 0;
        int total;
        
        while(chicken + r_coupon > 9) {
            total = chicken + r_coupon;
            answer += total / 10;
            r_coupon = total % 10;
            chicken = total / 10;
        }    
        
        return answer;
    }
}