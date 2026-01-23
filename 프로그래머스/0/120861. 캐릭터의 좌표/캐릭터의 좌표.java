class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;

        int max1 = (int) (board[0] / 2);
        int max2 = (int) (board[1] / 2);

        for(String k : keyinput){
            if(k.equals("left") && answer[0] > -max1){
                answer[0]--;
            } else if(k.equals("right") && answer[0] < max1){
                answer[0]++;
            } else if(k.equals("up") && answer[1] < max2){
                answer[1]++;
            } else if(k.equals("down") && answer[1] > -max2){
                answer[1]--;
            }
        }
        
        return answer;
    }
}