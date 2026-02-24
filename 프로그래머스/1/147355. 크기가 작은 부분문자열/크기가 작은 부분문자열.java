class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String token = t.substring(i, i + p.length());
            
            // 타입 주의
            // if (Long.parseLong(token) <= Long.parseLong(p)) {
            //     cnt ++;
            // }
            
            // 문자열 사전 비교(compareTo)
            if (token.compareTo(p) <= 0) {
                cnt ++;
            }
        }
        
        return cnt;
    }
}