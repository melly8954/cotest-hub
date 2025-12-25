class Solution {
    public int[] solution(int[] num_list) {
        int hol_count = 0;
        int zzak_count = 0;
        int[] answer = new int[2];
        
        for(int num : num_list) {
            if(num % 2 != 0) {
                hol_count++;
            }else {
                zzak_count++;
            }
        }
        answer[0] = zzak_count;
        answer[1] = hol_count;
               
        return answer;
    }
}