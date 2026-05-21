import java.util.TreeMap;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        int[] answer = new int[2];

        for (String op : operations) {
            if (op.charAt(0) == 'I') {
                int n = Integer.parseInt(op.substring(2));
                tree.put(n, 1);
            } else if ("D 1".equals(op)) {
                if (!tree.isEmpty()) {
                    tree.remove(tree.lastKey());
                }

            } else if ("D -1".equals(op)) {
                if (!tree.isEmpty()) {
                    tree.remove(tree.firstKey());
                }
            }
        }

        if (!tree.isEmpty()) {
            answer[0] = tree.lastKey();
            answer[1] = tree.firstKey();
        }
        return answer;
    }
}