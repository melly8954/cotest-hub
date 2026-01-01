import java.util.*;

class Solution {    
    public String solution(String letter) {
        String answer = "";
        
        String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Character> morseMap = new HashMap<>();
        
        for(int i = 0; i<MORSE.length; i++){
            morseMap.put(MORSE[i], (char)('a' + i) );
        }
        
        String words[] = letter.split(" ");
        
        for(String word : words){
            answer += morseMap.get(word);
        }
        
        return answer;
    }
}