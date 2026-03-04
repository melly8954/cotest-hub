class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int total_can = n;
        int new_cola = 0;
        
        while (total_can >= a) {    // a개 이상 있어야 새 콜라로 교환 가능
            new_cola = (total_can / a) * b;     // 새로 받은 콜라
            total_can = new_cola + (total_can % a); // 새로 받은 콜라 + 남은 빈 병 
            sum += new_cola;
        }
        
        return sum;
    }
}