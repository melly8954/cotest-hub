class Solution {
    public int solution(int n) {
        int num = 0;
        int cnt = 0;

        while (cnt < n) {
            num++;

            // 3의 배수이거나 숫자에 3이 포함되면 제외
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }

            // 조건을 만족하면 카운트 증가
            cnt++;
        }

        return num;
    }
}
