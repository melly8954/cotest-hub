class Solution {
    public boolean solution(String s) {
        boolean lenFlag = false;
        boolean allDigitFlag = true;
        
        int len = s.length();
        if (len == 4 || len == 6) {
            lenFlag = true;
        }
        
        char[] ch = s.toCharArray();
        
        for (char c : ch) {
            if (!Character.isDigit(c)) {
                allDigitFlag = false;
            }
        }
        
        return lenFlag && allDigitFlag;
    }
}