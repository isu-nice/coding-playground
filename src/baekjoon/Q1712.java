package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long fixedCost = (long) Integer.parseInt(st.nextToken());
        long variableCost = (long) Integer.parseInt(st.nextToken());
        long price = (long) Integer.parseInt(st.nextToken());
        long income = price - variableCost;
        long bePoint = 1;

        if (income <= 0) bePoint = -1;
        else {
            bePoint += fixedCost / income;
        }

        System.out.println(bePoint);
    }
}