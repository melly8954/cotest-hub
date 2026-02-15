class Solution {
    public String solution(String phone_number) {
        String[] token = phone_number.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < token.length; i++) {
            if (i < token.length - 4) {
                token[i] = "*";
            }
            
            sb.append(token[i]);
        }
        
        return sb.toString();
    } 
}