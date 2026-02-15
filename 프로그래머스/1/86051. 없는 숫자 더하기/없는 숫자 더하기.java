class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        String numStr = "";
        String zeroToTen = "0123456789";
        for (int n : numbers) {
            numStr += String.valueOf(n);
        } 
        
        for (String token : zeroToTen.split("")) {
            if (!numStr.contains(token)) {
                sum += Integer.parseInt(token);
            }
        }
        
        return sum;
    }
}