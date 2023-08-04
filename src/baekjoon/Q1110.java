package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int primeNum = Integer.parseInt(br.readLine());
        String resultNum = "-1";
        int fir, sec, cnt = 0;

        while (Integer.parseInt(resultNum) != primeNum) {
            cnt++;

            if (resultNum.equals("-1")) resultNum = Integer.toString(primeNum);

            if (Integer.parseInt(resultNum) < 10) {
                fir = 0;
                sec = Integer.parseInt(resultNum);
            } else {
                fir = Integer.parseInt(resultNum.substring(0, 1));
                sec = Integer.parseInt(resultNum.substring(1));
            }

            resultNum = Integer.toString(fir + sec);

            if (fir + sec < 10) {
                resultNum = Integer.toString(sec) + resultNum;
            } else {
                resultNum = Integer.toString(sec) + resultNum.substring(1);
            }

        }

        System.out.println(cnt);
    }

}
