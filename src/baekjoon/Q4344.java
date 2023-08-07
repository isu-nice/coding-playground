package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int studentNum, sum, cnt;
        int[] score;
        double answer;

        for (int i = 1; i <= caseNum; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            studentNum = Integer.parseInt(st.nextToken());
            score = new int[studentNum];
            sum = 0;
            cnt = 0;

            for (int j = 0; j < studentNum; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }

            double avg = (double) sum / studentNum;

            for (int j = 0; j < studentNum; j++) {
                if (score[j] > avg) cnt++;
            }

            answer = (double) cnt * 100 / studentNum;
            System.out.println(String.format("%.3f", answer) + "%");
        }
    }

}
