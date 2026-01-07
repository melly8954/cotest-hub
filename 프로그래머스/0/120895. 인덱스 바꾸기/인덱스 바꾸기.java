import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder("");
        
        List<Character> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            list.add(c);
        }
        
        char[] arr = new char[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        
        char temp1 = arr[num1] ;
        char temp2 = arr[num2] ;
        
        arr[num1] = temp2;
        arr[num2] = temp1;
        
        for(char c : arr){
            sb.append(c);
        }
        
        return sb.toString();
    }
}