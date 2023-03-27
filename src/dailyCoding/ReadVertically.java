package dailyCoding;

public class ReadVertically {
    public String readVertically(String[] arr) {
        StringBuilder result = new StringBuilder();

        // 가장 긴 단어의 길이를 구한다
        int max = 0;
        for (String word : arr) {
            max = Math.max(word.length(), max);
        }

        for (int i = 0; i < max; i++) {
            for (String word : arr) {
                // 단어의 길이가 클 때만 append
                if (word.length() > i) {
                    result.append(word.charAt(i));
                }
            }
        }

        return result.toString();
    }
}
