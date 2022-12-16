package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int userCardNumber = Integer.parseInt(console.readLine());
        String userInput = console.readLine();
        String[] userCards = userInput.split(" ");

        int comparisonCardNumber = Integer.parseInt(console.readLine());
        String comparisonInput = console.readLine();
        String[] comparisonCards = comparisonInput.split(" ");

        int[] possess = new int[comparisonCardNumber];

        for (int k = 0; k < comparisonCardNumber; k++) {
            for (int i = 0; i < userCardNumber; i++) {
                if (comparisonCards[k].equals(userCards[i])) {
                    possess[k]++;
                }
            }
            System.out.printf("%d ", possess[k]);
        }
    }
}
