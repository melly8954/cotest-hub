import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        Stack<String> stack = new Stack<>();
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 > 0) {
                for (int j = 0; j < food[i] / 2; j++) {
                    stack.push(String.valueOf(i));
                    sb.append(i);
                }
            }
        }
        
        sb.append("0");
        
        while (!stack.isEmpty()) {
            String n = stack.pop();
            sb.append(n);
        }
        
        return sb.toString();
    }
}