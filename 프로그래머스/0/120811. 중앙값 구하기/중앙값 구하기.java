import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int center = array.length/2 + 1;
        return array[center-1];
    }
}