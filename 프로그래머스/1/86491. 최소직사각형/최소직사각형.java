class Solution {
    public int solution(int[][] sizes) {
        int maxSide = 0;
        int minSide = 0;

        for (int i = 0; i < sizes.length; i++) {
            int big = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);

            maxSide = Math.max(maxSide, big);
            minSide = Math.max(minSide, small);
        }

        return maxSide * minSide;
    }
}