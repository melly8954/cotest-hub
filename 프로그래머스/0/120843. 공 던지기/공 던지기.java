class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        int cnt = 0;
        
        while(cnt < k){
            if(idx >= numbers.length){
                idx %= numbers.length;
            }
            answer = numbers[idx];
            idx += 2;
            cnt++;
        }
        
        return answer;
        
        // 다른 사람 풀이
        // int index = ((k - 1) * 2) % numbers.length;
        // return numbers[index];
        
        // 원형 큐
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