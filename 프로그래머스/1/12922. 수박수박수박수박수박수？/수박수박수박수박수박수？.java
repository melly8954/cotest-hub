class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int idx = 1;
        
        while (idx <= n) {
            if (idx % 2 != 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
            
            idx ++;
        }
        
        return sb.toString();
    }
}