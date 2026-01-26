class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int idx = i; idx <= j; idx++) {
            String s = String.valueOf(idx); // 1, 10, 11, 12, 13

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