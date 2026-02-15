class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        String num_str = "";
        String zeroToTen = "0123456789";
        for (int n : numbers) {
            num_str += String.valueOf(n);
        } 
        
        for (String token : zeroToTen.split("")) {
            if (!num_str.contains(token)) {
                sum += Integer.parseInt(token);
            }
        }
        
        return sum;
    }
}