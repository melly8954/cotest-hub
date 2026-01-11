class Solution {
    public String[] solution(String[] quiz) {
        String answer[] = new String[quiz.length];
        int r = 0;
        int qIndex = 0;
        
        for(String s : quiz){
            String[] token = s.split(" ");
            r = Integer.parseInt(token[0]);
            
            if(token[1].equals("+")){
                r += Integer.parseInt(token[2]);
            } else{
                r -= Integer.parseInt(token[2]);
            } 
            
            if(r == Integer.parseInt(token[4])){
                answer[qIndex] = "O";
            } else {
                answer[qIndex] = "X";
            }
            
            qIndex++; 
        }
        
        return answer;
        
    }
}