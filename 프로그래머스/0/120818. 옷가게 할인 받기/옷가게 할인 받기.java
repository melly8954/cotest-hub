class Solution {
    public int solution(int price) {
        if(price >=500000) {
            double result = price * 0.8;
            return (int) result;
        } else if(price >=300000) {
            double result = price * 0.9;
            return (int) result;
        } else if(price >=100000) {
            double result = price * 0.95;
            return (int) result;
        } else {
            return price;
        }
    }
}