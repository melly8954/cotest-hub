import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            list.add(n);
        }

        int min = list.stream().min((a, b) -> a - b).orElse(0);
        // int min2 = list.stream().mapToInt(n -> n).min().getAsInt();

        list.remove(Integer.valueOf(min));

        if (list.size() == 0) {
            list.add(-1);
            return list.stream().mapToInt(n -> n).toArray();
        } else {
            return list.stream().mapToInt(n -> n).toArray();
        }
        
        // 배열 그대로 풀기
//         if (arr.length == 1) {
//             return new int[]{-1};
//         }
//         int min = Arrays.stream(arr).min().getAsInt();

//         return Arrays.stream(arr).filter(n -> n != min).toArray();
    }
}