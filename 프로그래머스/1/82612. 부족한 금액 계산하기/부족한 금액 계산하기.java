class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        int multiplePrice = 0;
        
        for (int i = 1; i <= count; i++) {
            multiplePrice = price * i;
            sum += multiplePrice;
        }
        
        if (sum > money) {
            return sum - money;
        } else {
            return 0;
        }
        
    }
}