import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        String[] strArr = my_string.replaceAll("[a-zA-Z]","").split("");
        
        for(int i = 0; i < strArr.length; i++){
            String word = strArr[i];
            list.add(Integer.parseInt(word));
        }
        
        Collections.sort(list);
        
//         int[] answer = new int[list.size()];
        
//         for(int i = 0; i < list.size(); i++){
//             answer[i] = list.get(i);
//         }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;        
    }
}