import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] result = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / (double) 2;
        }
        
        double[] avg_clone = avg.clone();
        Arrays.sort(avg_clone);
        
        for(int i = 0; i < avg.length; i++) {
            int rank = 1;
            
            for(int j = 0; j < avg.length; j++) {
                if(avg[i] < avg_clone[j]) {
                    rank ++;
                }
            }
            result[i] = rank;
        }
        
        return result;
    }
}


