import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        List<String> list = new ArrayList<>();
        String word = "";

        for(String s : spell){  // "z", "d", "x"
            list.add(s);
        }

        for(int i = 0; i < dic.length; i++){
            word = dic[i];  // "def", "dww", "dzx", "loveaw"
            boolean allExist = true; // 각 단어마다 초기화

            for(int j = 0; j < spell.length; j++){
                if(!(word.contains(list.get(j)))){
                    allExist = false;
                    break;
                }
            }

            if (allExist) {
                answer = 1;
            }
        }
        
        return answer;
    }
}