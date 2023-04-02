package dailyCoding;
// TODO 패키지 밑으로 복사

import java.util.*;
import java.util.regex.Pattern;

public class Solution {
    public int largestProductOfThree(int[] arr) {
        // 배열 정렬해줌
        Arrays.sort(arr);

        // case1 : 제일 첫 요소 두 개 곱한 것과 제일 마지막 요소 곱하는 경우
        int answer1 = arr[0] * arr[1] * arr[arr.length - 1];

        // case2 : 제일 큰 요소 세개를 곱하는 경우
        int answer2 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

        // 둘 중에 더 큰 것이 정답
        return Math.max(answer1, answer2);
    }

    public String decryptCaesarCipher(String str, int secret) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // 공백은 그대로 공백으로 둔다
            if (str.charAt(i) == ' ') {
                answer.append(" ");
                continue;
            }

            int decryptNum = str.charAt(i) - secret;

            // 복호화 한 값이 a 보다 작은 값이 나올 경우 그만큼 빼준 값을 z부터 세어서 append 함
            if (decryptNum < 'a') {
                decryptNum = ('z' + 1) - ('a' - decryptNum);
            }

            answer.append((char) decryptNum);
        }

        return answer.toString();
    }

    public long power(int base, int exponent) {
        long answer = 1;
        final int divider = 94_906_249;

        for (int i = 1; i <= exponent; i++) {
            answer *= base;
            answer %= divider;
        }

        return answer;
    }

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