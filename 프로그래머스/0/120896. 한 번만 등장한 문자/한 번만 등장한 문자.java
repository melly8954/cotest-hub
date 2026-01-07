import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] str = s.split("");
        
        Arrays.sort(str);
        
        for(String x : str){
            // 문자의 첫 등장 위치와 마지막 등장 위치가 같을 경우
            // 그 문자는 중복된 문자가 없음을 의미
            if (s.indexOf(x) == s.lastIndexOf(x)) {
                sb.append(x);
            }    
        }
        

        return sb.toString();
    }
}