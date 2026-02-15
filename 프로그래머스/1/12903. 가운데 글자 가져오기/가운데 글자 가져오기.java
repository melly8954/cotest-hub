class Solution {
    public String solution(String s) {
        // 기존 풀이
//         char[] ch = s.toCharArray();
//         char c;
        
//         StringBuilder sb = new StringBuilder();
        
//         for (int i = 0; i < ch.length; i++) {
            
//         }
        
//         if (s.length() % 2 == 0) {
//             c = ch[ch.length / 2 - 1];
//             sb.append(c);
            
//             c = ch[ch.length / 2];
//             sb.append(c);
//         } else {
//             c = ch[ch.length / 2];
//             sb.append(c);
//         }
        
//         return sb.toString();
        
        // substring() 사용
        int mid = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        } else {
            return s.substring(mid, mid + 1);
        }
    }
}