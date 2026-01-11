class Solution {
    public int solution(int num, int k) {
//         // k가 없는 경우 초기값 -1
//         int answer = -1;
        
//         String num_str = String.valueOf(num);
        
//         String[] num_arr = num_str.split("");
        
//         for(int i = 0; i < num_arr.length; i++){
//             int n = Integer.parseInt(num_arr[i]);
            
//             if(n == k){
//                 answer = i+1;
//                 break;
//             } 
//         }
        
//         return answer;
        
        // 코드 1줄 풀이
        return ("-" + num).indexOf(String.valueOf(k));
    }
}