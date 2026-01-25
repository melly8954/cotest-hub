class Solution {
    public int solution(int[][] dots) {
        // 첫 번째 점의 x좌표를 기준으로 사용
        int start = dots[0][0];

        int w = 0; // width
        int l = 0; // length
        
        for(int i = 0; i < dots.length; i++){
            // x좌표가 기준점(dots[0])과 같으면 같은 세로선에 있는 점이므로
            // 기준점의 y좌표(dots[0][1])와의 차이를 세로 길이로 계산
            if(dots[i][0] == start){
                l = Math.abs(dots[i][1] - dots[0][1]);
            } 
            // x좌표가 기준점과 다르면 반대쪽 세로선에 있는 점이므로
            // 기준점의 x좌표(dots[0][0])와의 차이를 가로 길이로 계산
            else{
                w = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        
        return l * w;
    }
}