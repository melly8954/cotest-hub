import java.util.*;

class Solution {
    public int solution(String s) {
//         StringBuilder sb = new StringBuilder();
//         StringBuilder temp = new StringBuilder();
        
//         Map<String, String> map = Map.of(
//             "zero","0",
//             "one","1",
//             "two","2",
//             "three","3",
//             "four","4",
//             "five","5",
//             "six","6",
//             "seven","7",
//             "eight","8",
//             "nine","9"
//         );
        
//         for (char ch : s.toCharArray()) {
//             if (Character.isDigit(ch)) {
//                 sb.append(ch);               
//             } else {
//                 temp.append(ch);
                
//                 if (map.containsKey(temp.toString())) {
//                     sb.append(map.get(temp.toString()));
//                     temp.setLength(0);
//                 }
//             }
//         }
        
//         return Integer.parseInt(sb.toString());
        
        
        // 이차원 배열 및 replace 메서드 사용
        String[][] mapArr = {
            {"zero", "0"},
            {"one", "1"},
            {"two", "2"},
            {"three", "3"},
            {"four", "4"},
            {"five", "5"},
            {"six", "6"},
            {"seven", "7"},
            {"eight", "8"},
            {"nine", "9"}
        };
        
        for (String[] arr : mapArr) {
            s = s.replace(arr[0], arr[1]);
        }
        
        return Integer.parseInt(s);
    }
}