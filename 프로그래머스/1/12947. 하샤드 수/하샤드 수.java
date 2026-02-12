class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        
        String[] str = String.valueOf(x).split("");
        
        for (String token : str) {
            sum += Integer.parseInt(token);
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}