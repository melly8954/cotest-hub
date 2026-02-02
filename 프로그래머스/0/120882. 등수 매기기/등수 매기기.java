import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                avg[i] = (score[i][0] + score[i][1]) / 2.0;
            }
        }
        
        double[] sorted = avg.clone();
        Arrays.sort(sorted);
        
        for(int i = 0; i < avg.length; i++) {
            int rank = 1;
            
            for(int j = 0; j < avg.length; j++){
                if(avg[i] < sorted[j]) {
                    rank ++;
                }
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}


