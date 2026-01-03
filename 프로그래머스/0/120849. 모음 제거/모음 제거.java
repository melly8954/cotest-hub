class Solution {
    public String solution(String my_string) {
//         String answer = "";
        
//         answer = checkWord(my_string);
       
//         return answer;
        
        return my_string.replaceAll("[aeiou]", "");
    }
    
//     private String checkWord(String my_string){
//         String result = "";
        
//         for(int i = 0; i < my_string.length(); i++){
//             char word = my_string.charAt(i);            
            
//             if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
//                 continue;
//             }
            
//             result += word;
//         }
//         return result;
//     }
}