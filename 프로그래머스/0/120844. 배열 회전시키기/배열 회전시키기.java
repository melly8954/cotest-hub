import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
//         if(direction.equals("left")){
//             int temp = numbers[0];
            
//             for(int i = 1; i < numbers.length; i++){
//                 numbers[i-1] = numbers[i]; 
//             }
            
//             numbers[numbers.length - 1] = temp;
//         }
        
//         if(direction.equals("right")){
//             int temp = numbers[numbers.length - 1];
            
//             for(int i = numbers.length - 1; i > 0 ; i--){
//                 numbers[i] = numbers[i-1]; 
//             }
            
//             numbers[0] = temp;
//         }
        
//         return numbers;
        
        // 수정된 풀이
        int answer[] = new int[numbers.length];
        
        if(direction.equals("left")){
            int temp = numbers[0];
            
            for(int i = 1; i < numbers.length; i++){
                answer[i-1] = numbers[i]; 
            }
            
            answer[numbers.length - 1] = temp;
        }
        
        if(direction.equals("right")){
            int temp = numbers[numbers.length - 1];
            
            for(int i = 0; i < numbers.length - 1; i++){
                answer[i+1] = numbers[i]; 
            }
            
            answer[0] = temp;
        }
        
        return answer;
        
        // ArrayList 사용
//         ArrayList<Integer> answer = new ArrayList<>();

//         for (int i = 0; i < numbers.length; i++) {
//             answer.add(numbers[i]);
//         }

//         if (direction.equals("right")) {
//             answer.add(0, numbers[numbers.length - 1]);
//             answer.remove(answer.size() - 1);
//         } else {
//             answer.add(numbers[0]);
//             answer.remove(0);
//         }

//         int[] result = new int[answer.size()];
//         for (int i = 0; i < answer.size(); i++) {
//             result[i] = answer.get(i);
//         }

//         return result;
    }
}