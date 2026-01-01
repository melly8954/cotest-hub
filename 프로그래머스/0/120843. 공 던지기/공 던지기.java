class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;   // 공을 받을 사람의 인덱스
        int cnt = 0;   // 공을 던진 횟수

        // k번 공을 던질 때까지 반복
        while (cnt < k) {

            // 인덱스가 배열 길이를 넘으면 처음으로 되돌림 (원형 구조)
            if (idx >= numbers.length) {
                idx %= numbers.length;
            }

            answer = numbers[idx]; // 현재 공을 받는 사람
            idx += 2;              // 한 명 건너뛰고 다음 사람
            cnt++;                 // 던진 횟수 증가
        }
        
        return answer;
        
//         다른 사람 풀이
//         int index = ((k - 1) * 2) % numbers.length;
//         return numbers[index];
        
//         원형 큐
//         Queue<Integer> queue = new LinkedList<>();
        
//         for (int num : numbers) {
//             queue.offer(num);
//         }

//         int answer = 0;

//         for (int i = 0; i < k; i++) {
//             // 공 받는 사람
//             answer = queue.poll();   

//             // 두 명 건너뛰기
//             queue.offer(queue.poll());
//             queue.offer(queue.poll());
//         }

//         return answer;
    }
}