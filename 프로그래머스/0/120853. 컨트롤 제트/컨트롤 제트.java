import java.util.*;

class Solution {
    public int solution(String s) {
//         int answer = 0;
//         String[] strArr = s.split(" ");
        
//         for(int i = 0; i < strArr.length; i++){
//             if(strArr[i].equals("Z")){
//                 answer -= Integer.parseInt(strArr[i-1]);
//             } else{
//                 answer += Integer.parseInt(strArr[i]);
//             }
            
//         }
//         return answer;
        
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}