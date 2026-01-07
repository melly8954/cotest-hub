class Solution {
    public String solution(String cipher, int code) {
        String[] n = cipher.split("");
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < cipher.length(); i++){
            if((i+1) % code ==0){
                sb.append(n[i]);
            } 
        }
            
        return sb.toString();
    }
}