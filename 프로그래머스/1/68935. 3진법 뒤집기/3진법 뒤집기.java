class Solution {
    public int solution(int n) {
        String threeWord = toBase3(n);
        
        StringBuilder sb = new StringBuilder();
        
        String reverseWord = sb.append(threeWord).reverse().toString();
        
        return fromBase3(reverseWord);
    }
    
    private String toBase3(int n) {
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 3);  
            n /= 3;            
        }

        return sb.reverse().toString(); // 거꾸로 뒤집기, 여기까지는 3진법 구하기
    }
    
    public int fromBase3(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; 
            result = result * 3 + digit;
        }

        return result;
    }
}