package coplitPractice;

public class Barcode {
    public String barcode(int len) {
        return dfs("", len);
    }

    public String dfs(String answer, int len) {

        String[] nums = new String[]{"1", "2", "3"};

        // 탈출 조건
        if (answer.length() == len) {
            return answer;
        }

        for (String num : nums) {

            String concat = answer + num;

            if (isValid(concat)) {
                String search = dfs(concat, len);

                // dfs의 결과가 null인 경우 한단계 전으로 돌아가서 다시 dfs한다.
                if (search != null) {
                    return search;
                }
            }
        }

        return null;
    }

    public boolean isValid(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverseStr = builder.reverse().toString();

        for (int i = 1; i <= str.length() / 2; i++) {
            String sub = reverseStr.substring(0, i);
            String nextSub = reverseStr.substring(i, i + i);
            if (sub.equals(nextSub)) {
                return false;
            }
        }
        return true;
    }
}
