class Solution {
    public int solution(int i, int j, int k) {
//         int answer = 0;

//         for(int idx = i; idx <= j; idx++) {
//             String s = String.valueOf(idx); 

//             String[] token = s.split("");

//             for(String st : token) {
//                 if(st.contains(String.valueOf(k))){
//                     answer++;
//                 }
//             }
//         }

//         return answer;
        
        // 산술 연산 풀이
        int answer = 0;

        for (int n = i; n <= j; n++) {
            int num = n;

            

            while (num > 0) {
                if (num % 10 == k) {
                    answer++;
                }
                num /= 10;
            }
        }

        return answer;
    }
}