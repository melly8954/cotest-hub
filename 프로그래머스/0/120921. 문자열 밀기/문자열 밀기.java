class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) {
            return 0;
        }
        
        int len = A.length();
        
        char[] a = A.toCharArray();
        
        for(int i = 1; i <= len; i++) {
            char temp = a[len-1];
            
            for(int j = len - 1 ; j > 0; j--) {
                a[j] = a[j-1];
            }
            a[0] = temp;
            
            if(String.valueOf(a).equals(B)) {
                return i;
            }
        }
        
       return -1;
    }
}