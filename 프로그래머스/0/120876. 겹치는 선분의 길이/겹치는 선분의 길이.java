class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        // 좌표 범위: -100 ~ 100 → 0 ~ 200 보정
        int[] count = new int[201];

        // 각 선분 표시
        for (int i = 0; i < 3; i++) {
            int start = lines[i][0] + 100;
            int end   = lines[i][1] + 100;

            for (int j = start; j < end; j++) {
                count[j]++;
            }
        }

        // 2개 이상 겹친 구간의 길이 계산
        for (int i = 0; i < 200; i++) {
            if (count[i] >= 2) {
                answer++;
            }
        }

        return answer;
    }
}