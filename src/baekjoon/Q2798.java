package baekjoon;

import java.util.Scanner;

public class Q2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int card[] = new int[100];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= M) ans = Math.max(ans, sum);
                }
            }
        }
        sc.close();
        System.out.println(ans);
    }
}