class Solution {
    boolean solution(String s) {
        String[] str = s.split("");
        int cnt_p = 0;
        int cnt_y = 0;
        boolean result = false;
        
        for (String token : str) {
            if ("p".equalsIgnoreCase(token)) {
                cnt_p ++;
            } else if ("y".equalsIgnoreCase(token)) {
                cnt_y ++;
            } 
        }
        
        if (cnt_p == cnt_y) {
            result = true;
        } 
        
        return result;
    }
}