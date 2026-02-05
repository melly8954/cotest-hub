class Solution {
    public int solution(int M, int N) {
        if(M == 1 && N == 1) {
            return 0;
        } else {
            return M * N - 1;
        }
    }
}