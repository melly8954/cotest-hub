import java.util.*;

class Solution {
    public long solution(String numbers) {
//         Map<String, String> map = new HashMap<>();
        
//         map.put("one","1");
//         map.put("two","2");
//         map.put("three","3");
//         map.put("four","4");
//         map.put("five","5");
//         map.put("six","6");
//         map.put("seven","7");
//         map.put("eight","8");
//         map.put("nine","9");
//         map.put("zero","0");
        
//         for (Map.Entry<String, String> e : map.entrySet()) {
//             numbers = numbers.replace(e.getKey(), e.getValue());
//         }
        
//         return Long.parseLong(numbers);
        
        String[] arr = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine" };
        
        for(int i = 0; i < arr.length; i++){
            numbers = numbers.replace(arr[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}