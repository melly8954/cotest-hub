import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            list.add(n);
        }

        int min = list.stream().min((a, b) -> a - b).get();
        // int min2 = list.stream().mapToInt(n -> n).min().getAsInt();

        list.remove(Integer.valueOf(min));

        if (list.size() == 0) {
            list.add(-1);
            return list.stream().mapToInt(n -> n).toArray();
        } else {
            return list.stream().mapToInt(n -> n).toArray();
        }
    }
}