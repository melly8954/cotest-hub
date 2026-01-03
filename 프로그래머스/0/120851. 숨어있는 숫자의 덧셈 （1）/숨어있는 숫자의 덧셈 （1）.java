class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.replaceAll("[a-zA-Z]","").split("");
        
        for(int i = 0; i < strArr.length; i++){
            int num = Integer.parseInt(strArr[i]);
            answer += num;
        }
        
        return answer;
    }
}