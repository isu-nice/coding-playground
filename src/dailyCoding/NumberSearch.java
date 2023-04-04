package dailyCoding;

import java.util.regex.Pattern;

public class NumberSearch {
    public int numberSearch(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        // 문자열의 공백을 제거해줌
        str = str.replace(" ", "");

        int num = 0;
        int len = str.length();

        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));

            // 숫자인 경우
            if (Pattern.matches("[0-9]", temp)) {
                // answer에 숫자 더해주고 문자열의 길이를 1 빼준다.
                num += Integer.parseInt(temp);
                len--;
            }
        }

        double answer = (double) num / (double) len;
        return (int) Math.round(answer);
    }
}
