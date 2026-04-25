import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
//         Stack<Integer> stack = new Stack<>();
        
//         for (int n : arr) {
//             // 스택이 비어있거나, 맨 위 값이 현재 숫자와 다를 때만 push 
//             if (stack.isEmpty() || stack.peek() != n) {
//                 stack.push(n);
//             }
//         }
        
//         int[] result = new int[stack.size()];
        
//         for (int i = stack.size() - 1; i >= 0; i--) {
//             result[i] = stack.pop();
//         }
        
//         return result;
        
        // 다른 풀이
//         List<Integer> list = new ArrayList<>();
        
//         for (int n : arr) {
//             if (list.isEmpty() || list.get(list.size() - 1) != n) {
//                 list.add(n);
//             }
//         }
        
//         return list.stream().mapToInt(i -> i).toArray();
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}