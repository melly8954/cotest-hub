import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder("");
        char[] ch = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            
            ch[i] = c;
        }
        
        Arrays.sort(ch);
        
        for(char c : ch){
            sb.append(c);
        }
        
        return sb.toString();
    }
}