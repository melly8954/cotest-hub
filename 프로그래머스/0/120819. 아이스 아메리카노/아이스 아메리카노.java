class Solution {
    public int[] solution(int money) {
        int d = money / 5500;
        int r = money % 5500;
            
        return new int[]{d,r};
    }
}