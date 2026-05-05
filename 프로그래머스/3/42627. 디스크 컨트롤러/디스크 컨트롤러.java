import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int count = 0;

        boolean[] visited = new boolean[jobs.length];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        while (count < jobs.length) {

            // 현재 시간까지 도착한 작업들을 pq에 넣기
            for (int i = 0; i < jobs.length; i++) {
                if (!visited[i] && jobs[i][0] <= time) {
                    pq.offer(jobs[i]);
                    visited[i] = true;
                }
            }

            // 현재 처리 가능한 작업이 없다면 시간 1 증가
            if (pq.isEmpty()) {
                time++;
                continue;
            }

            // 작업 시간이 가장 짧은 작업 처리
            int[] job = pq.poll();

            time += job[1];

            // 반환 시간 = 종료 시간 - 요청 시간
            answer += time - job[0];

            count++;
        }

        return answer / jobs.length;
    }
}