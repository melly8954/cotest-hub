import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int n : arr) {
            // 스택이 비어있거나, 맨 위 값이 현재 숫자와 다를 때만 push 
            if (stack.isEmpty() || stack.peek() != n) {
                stack.push(n);
            }
        }
        
        int[] result = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}