import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;

        int gcd = gcd(a, b);

        int m = b/gcd;

        List<Integer> factorization = factorization(m);

        int[] array = factorization.stream().mapToInt(i -> i).toArray();

        for(int i : array) {
            if(!(i == 2 || i == 5)) {
                answer = 2;
            }
        }

        return answer;
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }

    private List<Integer> factorization(int num) {
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= num; i++) {
            if(num % i == 0) {
                list.add(i);
                while(num % i == 0) {
                    num /= i;
                }
            }
        }
        return list;
    }
}