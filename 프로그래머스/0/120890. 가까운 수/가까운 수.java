class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int num : array) {
            int diff = Math.abs(num - n);

            if (diff < minDiff) {
                minDiff = diff;
                answer = num;
            } else if (diff == minDiff && num < answer) {
                answer = num;
            }
        }
        return answer;
    }
}