class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= '0' && ch <= '9'){
                num += ch;
            } else{
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        if (!num.isEmpty()){
            sum += Integer.parseInt(num);
        }

        return sum;
        
        // 다른 풀이 (1)
//         int sum = 0;

//         // 숫자가 아닌 문자를 기준으로 분리
//         String[] numbers = my_string.split("[a-zA-Z]");

//         for (String num : numbers) {
//             if (!num.isEmpty()) {
//                 sum += Integer.parseInt(num);
//             }
//         }

//         return sum;
    }
}