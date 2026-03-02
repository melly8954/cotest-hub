import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
                
            int start = commands[i][0];
            int last = commands[i][1]; 
            int select = commands[i][2];
            
            for (int j = start - 1; j < last; j++) {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            int r = list.get(select - 1);
            
            result[i] = r;
        }
        
        return result;
    }
}