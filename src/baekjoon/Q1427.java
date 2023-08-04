package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String number = br.readLine();

        // 카운팅 정렬
        int[] countingArr = new int[10];

        for (int i = 0; i < number.length(); i++) {
            int n = number.charAt(i) - '0';
            countingArr[n]++;
        }

        for (int i = 9; i >= 0; i--) {

            if (countingArr[i] >= 1) {
                sb.append((i + "").repeat(countingArr[i]));
            }
        }

        System.out.println(sb);
    }
}