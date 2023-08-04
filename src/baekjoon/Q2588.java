package baekjoon;

import java.util.Scanner;

public class Q2588 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int upNum = sc.nextInt();
        int downNum = sc.nextInt();
        int fir, sec, thr;

        fir = downNum % 10;
        sec = downNum % 100 - fir;
        thr = downNum - fir - sec;

        System.out.println(upNum * fir);
        System.out.println(upNum * sec / 10);
        System.out.println(upNum * thr / 100);
        System.out.println(upNum * downNum);

        sc.close();
    }

}
