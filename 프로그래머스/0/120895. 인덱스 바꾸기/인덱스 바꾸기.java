import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
//         StringBuilder sb = new StringBuilder("");
        
//         List<Character> list = new ArrayList<>();
        
//         for(int i = 0; i < my_string.length(); i++){
//             char c = my_string.charAt(i);
//             list.add(c);
//         }
        
//         char[] arr = new char[list.size()];
//         for(int i = 0; i < list.size(); i++){
//             arr[i] = list.get(i);
//         }
        
//         char temp1 = arr[num1] ;
//         char temp2 = arr[num2] ;
        
//         arr[num1] = temp2;
//         arr[num2] = temp1;
        
//         for(char c : arr){
//             sb.append(c);
//         }
        
//         return sb.toString();
        
        // split("") 사용하여 문자열 배열 만들기
//         StringBuilder sb = new StringBuilder("");
        
//         String[] str = my_string.split("");
        
//         String temp1 = str[num1];
//         String temp2 = str[num2];
        
//         str[num2] = temp1;
//         str[num1] = temp2;
        
//         for(String s : str){
//             sb.append(s);
//         }
        
//         return sb.toString();
        
        // toCharArray() 사용
        StringBuilder sb = new StringBuilder("");
        char[] c = my_string.toCharArray();
        
        char temp1 = c[num1];
        char temp2 = c[num2];
        
        c[num2] = temp1;
        c[num1] = temp2;
        
        for(char swap : c){
            sb.append(swap);
        }
        
        return sb.toString();
        
    }
}