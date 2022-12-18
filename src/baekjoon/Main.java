package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int userCardNumber = Integer.parseInt(console.readLine());
        StringTokenizer userCard = new StringTokenizer(console.readLine());
        String[] userCards = new String[userCardNumber];

        for (int i = 0; i < userCardNumber; i++) {
            userCards[i] = userCard.nextToken();
        }

        int comparisonCardNumber = Integer.parseInt(console.readLine());
        StringTokenizer comparisonCard = new StringTokenizer(console.readLine());
        LinkedHashMap<String, Integer> possess = new LinkedHashMap<>();

        for (int j = 0; j < comparisonCardNumber; j++) {
            possess.put(comparisonCard.nextToken(), 0);
        }

        for (int k = 0; k < userCardNumber; k++) {
            if (possess.containsKey(userCards[k])) {
                possess.put(userCards[k], possess.get(userCards[k]) + 1);
            }
        }

        possess.keySet().forEach(key -> {
            int count = possess.get(key);
            System.out.printf("%d ", count);
        });
    }
}
