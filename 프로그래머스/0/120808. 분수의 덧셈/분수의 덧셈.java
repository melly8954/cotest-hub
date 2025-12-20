class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//         기존 풀이
//         int numer = numer1 * denom2 + numer2 * denom1;
//         int denom = denom1 * denom2;
        
//         int gcd = 1;
//         for (int i = 1; i <= Math.min(numer, denom); i++) {
//             if (numer % i == 0 && denom % i == 0) {
//                 gcd = i;
//             }
//         }
        
//         return new int[]{numer / gcd, denom / gcd};
        
        // 유클리드 호제법 적용
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = gcd(numer, denom);

        return new int[]{numer / gcd, denom / gcd};
    }
    
    // 유클리드 호제법
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}