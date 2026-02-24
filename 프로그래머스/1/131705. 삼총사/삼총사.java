import java.util.*;

class Solution {
    public int solution(int[] number) {
//         int cnt = 0;
        
//         for (int i = 0; i < number.length - 2; i++) {
//             for (int j = i + 1; j < number.length - 1; j++) {
//                 for (int k = j + 1; k < number.length; k++) {
//                     if (number[i] + number[j] + number[k] == 0) {
//                         cnt ++;
//                     }
//                 }
//             }
//         }
        
//         return cnt;
        
        
        // 다른 풀이 
        return combination(number, 0, 0, 0);
    }
    
    private int combination(
        int[] number,  // 전체 숫자 배열 (고정 데이터)
        int index,     // 이번 단계에서 선택을 시작할 인덱스 (이전 선택 다음 위치)
        int limit,     // 현재까지 선택한 원소 개수
        int sum        // 현재까지 선택한 원소들의 합
    ) {
        // 3개를 모두 선택했을 때
        if (limit == 3) {
            // 합이 0이면 유효한 조합이므로 1 반환
            // 아니면 0 반환
            return sum == 0 ? 1 : 0;
        }

        int count = 0; // 현재 단계에서 만들어질 유효한 조합 개수 누적

        // index부터 시작하는 이유:
        // 이미 선택한 인덱스 이전은 다시 고르지 않기 위해 (중복 방지)
        for (int i = index; i < number.length; i++) {

            // i번째 숫자를 선택한다고 가정하고
            // 다음 단계(재귀)로 넘김
            count += combination(
                    number,
                    i + 1,               // 다음 선택은 현재 i 다음부터만 가능
                    limit + 1,           // 하나 선택했으므로 개수 증가
                    sum + number[i]      // 선택한 값을 합에 추가
            );
        }

        // 현재 단계에서 만들어진 총 유효 조합 수 반환
        return count;
    }
}