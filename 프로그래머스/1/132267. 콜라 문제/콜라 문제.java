class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int total_can = n;
        int new_vacant = 0;
        
        while (total_can >= a) {
            new_vacant = (total_can / a) * b;
            total_can = new_vacant + (total_can % a);
            sum += new_vacant;
        }
        
        return sum;
    }
}