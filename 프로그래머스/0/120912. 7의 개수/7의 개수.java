class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int n : array){
             str += String.valueOf(n);
        }
        
        char[] ch = str.toCharArray();
        
        for(int c : ch){
            if(c == '7'){
                answer++;
            }
        }
        return answer;
    }
}