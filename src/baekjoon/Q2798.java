package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2798 {

    public static void main(String[] args) throws IOException {
        // newQ2798.run2(); // 초기 불이 방법
        new Q2798().run();  // 2023년 8월 재풀이
    }

    private void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int cardNum = Integer.parseInt(tokenizer.nextToken());
        int dealer = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        int[] cards = new int[cardNum];

        for (int index = 0; index < cardNum; index++) {
            cards[index] = Integer.parseInt(tokenizer.nextToken());
        }

        int result = startGame(cards, dealer);

        System.out.println(result);
    }

    private int startGame(int[] cards, int dealer) {
        int max = 0;
        int num = cards.length;

        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= dealer) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        return max;
    }

    // 기존 풀이 방법
    public void run2() {

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