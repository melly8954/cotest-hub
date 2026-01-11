class Solution {
    public int solution(int n) {
        int answer = 0;
        String str_n = String.valueOf(n);
        
        String[] arr = str_n.split("");
        
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}