class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        String zeroToTen = "0123456789";
        for (int n : numbers) {
            sb.append(String.valueOf(n));
        } 
        
        for (String token : zeroToTen.split("")) {
            if (!sb.toString().contains(token)) {
                sum += Integer.parseInt(token);
            }
        }
        
        return sum;
        
        // boolean 풀이
//         int sum = 0;
//         boolean[] exists = new boolean[10];
        
//         for (int n : numbers) {
//             exists[n] = true;
//         }

//         for (int i = 0; i < 10; i++) {
//             if (!exists[i]) {
//               sum += i;  
//             } 
//         }

//         return sum;
    }
}