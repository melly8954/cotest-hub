class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < my_string.length(); i++){
            char str = my_string.charAt(i);
            
            if(Character.isUpperCase(str)){
                sb.append(Character.toLowerCase(str));
            } else if(Character.isLowerCase(str)){
                sb.append(Character.toUpperCase(str));
            }
        }
        
        return sb.toString();
    }
}