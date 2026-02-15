class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        String zeroToTen = "0123456789";
        for (int n : numbers) {
            sb.append(String.valueOf(n));
        } 
        
        for (String token : zeroToTen.split("")) {
            if (!sb.toString().contains(token)) {
                sum += Integer.parseInt(token);
            }
        }
        
        return sum;
    }
}