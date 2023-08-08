package programmersLevel2;

import java.util.Arrays;

class BiggestNumber {
    public String solution(int[] numbers) {
        String answer = "";
        Arrays.sort(numbers);

        int cnt = 0;
        int maxNum = numbers[numbers.length - 1];

        while (maxNum / 10 > 0) {
            cnt++;
        }

        answer = Integer.toString(cnt);

        return answer;
    }
}