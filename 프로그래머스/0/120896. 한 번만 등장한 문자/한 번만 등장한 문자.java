import java.util.*;

class Solution {
    public String solution(String s) {
//         StringBuilder sb = new StringBuilder();

//         String[] str = s.split("");
        
//         Arrays.sort(str);
        
//         for(String x : str){
//             // 문자의 첫 등장 위치와 마지막 등장 위치가 같을 경우
//             // 그 문자는 중복된 문자가 없음을 의미
//             if (s.indexOf(x) == s.lastIndexOf(x)) {
//                 sb.append(x);
//             }    
//         }
        

//         return sb.toString();
        
        // Map 자료구조 기반
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                list.add(e.getKey());
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}