import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int cnt = 0;

        Queue<Process> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
        }

        while (!queue.isEmpty()) {
            Process current = queue.poll();

            boolean hasHigherPriority = false;

            for (Process p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current);
            } else {
                cnt++;

                if (current.index == location) {
                    return cnt;
                }
            }
        }

        return 0;
    }

    class Process {
        int index;
        int priority;

        Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}