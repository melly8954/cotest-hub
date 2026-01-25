class Solution {
    public String solution(String polynomial) {
        int xSum = 0;
        int iSum = 0;

        String[] str = polynomial.split("\\+");

        for(String s : str){
            String trim = s.trim();
            if(trim.contains("x")){
                if(trim.replace("x","").equals("")){
                    xSum += 1;
                } else{
                    xSum += Integer.parseInt(trim.replace("x",""));
                }
            } else{
                iSum += Integer.parseInt(trim);
            }
        }

        String xStr = xSum + "x";

        if(xSum != 0 && iSum != 0){
            if(xSum == 1){
                xStr = "x";
            }
            return xStr + " + " + iSum;
        } else if(xSum != 0 && iSum == 0){
            if(xSum == 1){
                xStr = "x";
            }
            return xStr;
        } else if(xSum == 0 && iSum != 0){
            return String.valueOf(iSum);
        }

        return "";
    }
}