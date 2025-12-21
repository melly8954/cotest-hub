import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 입력 배열 정렬
        Arrays.sort(array);
        
        // 최빈값 후보
        int answer = array[0];
        
        // 현재 값이 연속으로 등장한 횟수
        int count = 1;
        
        // count 최대 등장 횟수
        int maxCount = 0;
        
        // 최빈값이 여러 개인지 여부를 판단하는 플래그
        boolean duplicated = false;
        
        for(int i = 1; i<array.length; i++) {
            if(array[i] == array[i-1]) {
                // 이전 값과 같으면 연속 등장 → count 증가
                count ++;
            } else {
                // 다른 값이 나오면 연속이 끊겼으므로 count 초기화
                count = 1;
            }
            
            if(count > maxCount) {
                maxCount = count;
                answer = array[i];  // 최빈값 갱신
                duplicated = false;
            } else if (count == maxCount) {
                // 최빈값이 여러 개일 경우
                duplicated = true;
            }
        }
        
        return duplicated ? -1 : answer;
    }
}