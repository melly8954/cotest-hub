import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> deployCount = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(day);
        }

        while (!queue.isEmpty()) {
            int deployDay  = queue.poll();
            int cnt = 1;

            while (!queue.isEmpty() && deployDay  >= queue.peek()) {
                queue.poll();
                cnt++;
            }

            deployCount.add(cnt);
        }

        int[] answer = new int[deployCount.size()];

        for (int i = 0; i < deployCount.size(); i++) {
            answer[i] = deployCount.get(i);
        }

        return answer;
    }
}