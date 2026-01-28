class Solution {
    public int solution(int[][] board) {
        boolean[][] safe_area = new boolean[board.length][board.length];
        int cnt = 0;

        // 초기화
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                safe_area[i][j] = true;
            }
        }

        // 지뢰 위치 파악
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    // 위험 지역 파악
                    for(int di = -1; di <= 1; di++) {
                        for(int dj = -1; dj <= 1; dj++) {
                            // 위험 지역 마킹
                            int ni = i + di;
                            int nj = j + dj;

                            // 이차원 배열로 위험 지역 계산하기 때문에 0보다 크고 배열의 크기보다 작아야 함
                            if((ni >= 0 && ni < board.length) && (nj >= 0 && nj < board.length)) {
                                // 안전 지역은 true, 지뢰 구간은 false
                                safe_area[ni][nj] = false;
                            }
                        }
                    }
                }
            }
        }

        // 지뢰 안전 구간 찾기
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0 && safe_area[i][j] == true) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}