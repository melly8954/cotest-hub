class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            int idx = 0;
            String prev = "";
            boolean isValid = true;

            while (idx < word.length()) {
                boolean matched = false;

                for (String s : sounds) {
                    if (word.startsWith(s, idx) && !s.equals(prev)) {
                        idx += s.length();
                        prev = s;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}
