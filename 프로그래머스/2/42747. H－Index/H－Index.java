import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;
        int[] newCitations = new int[citations.length];

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0 ; i--) {
            newCitations[citations.length - i - 1] = citations[i];
        }

        for (int i = 0; i < citations.length; i++) {
            if (newCitations[i] >= i + 1) {
                hIndex = i + 1;
            }
        }

        return hIndex;
    }
}