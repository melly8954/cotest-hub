class Solution {
    public long solution(long n) {
        long answer = -1;
        
        // Math.sqrt()는 double 반환
        // (long) 형 변환 시 정수 부분만 반환 -> 완전 제곱수 확인 가능
        long sqrt = (long) Math.sqrt(n);
        
        if (sqrt * sqrt == n) {
            long next = sqrt + 1;
            answer = next * next;
        }
        
        return answer;
    }
}