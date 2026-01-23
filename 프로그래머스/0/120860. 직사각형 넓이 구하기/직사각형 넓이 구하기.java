class Solution {
    public int solution(int[][] dots) {
        int start = dots[0][0];
        int l = 0;
        int w = 0;
        
        for(int i = 0; i < dots.length; i++){
            if(dots[i][0] == start){
                l = Math.abs(dots[i][1] - dots[0][1]);
            } else{
                w = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        
        return l*w;
    }
}