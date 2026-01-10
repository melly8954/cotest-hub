import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>();

        for(String s : s1){
            list.add(s);
        }

        for(String s : s2){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(s)){
                    answer ++;
                }
            }
        }

        return answer;
    }
}