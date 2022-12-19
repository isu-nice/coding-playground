package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        int userCardNumber = Integer.parseInt(console.readLine());
        int[] userCards = new int[userCardNumber];

        tokenizer = new StringTokenizer(console.readLine());
        for (int j = 0; j < userCardNumber; j++) {
            userCards[j] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(userCards);

        int comparisonCardNumber = Integer.parseInt(console.readLine());

        tokenizer = new StringTokenizer(console.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < comparisonCardNumber; i++) {
            int comparisonCard = Integer.parseInt(tokenizer.nextToken());
            builder.append(binarySearch(comparisonCard, userCards, userCardNumber)).append(" ");
        }

        System.out.println(builder);
        console.close();
    }

    private static int binarySearch(int comparisonCard, int[] userCards, int userCardNumber) {
        int first = 0;
        int last = userCardNumber - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (userCards[mid] == comparisonCard) {
                return 1;
            }
            if (userCards[mid] < comparisonCard) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }
}
