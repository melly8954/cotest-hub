class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int idx = i; idx <= j; idx++) {
            String s = String.valueOf(idx); 

            String[] token = s.split("");

            for(String st : token) {
                if(st.contains(String.valueOf(k))){
                    answer++;
                }
            }
        }

        return answer;
    }
}