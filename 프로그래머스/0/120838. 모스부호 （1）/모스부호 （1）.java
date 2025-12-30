import java.util.*;

class Solution {
    
    static final String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
    public String solution(String letter) {
        String answer = "";
        
        Map<String, Character> morseMap = new HashMap<>();
        
        for(int i = 0; i<MORSE.length; i++){
            morseMap.put(MORSE[i], (char)('a' + i) );
        }
        
        String m[] = letter.split(" ");
        
        for(int i = 0; i<m.length; i++){
            answer += morseMap.get(m[i]);
        }
        
        return answer;
    }
}