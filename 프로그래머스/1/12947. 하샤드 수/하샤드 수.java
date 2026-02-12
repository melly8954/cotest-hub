class Solution {
    public boolean solution(int x) {
//         boolean answer = false;
//         int sum = 0;
        
//         String[] str = String.valueOf(x).split("");
        
//         for (String token : str) {
//             sum += Integer.parseInt(token);
//         }
        
//         if (x % sum == 0) {
//             answer = true;
//         }
        
//         return answer;
        
        // 숫자로 진행하기
        boolean answer = false;
        int origin = x;
        int sum = 0;
        
        while (x > 0) {
            sum += x % 10;
            
            x /= 10;
        }
        
        if (origin % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}