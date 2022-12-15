package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for(int k = 0; k < comparisonCardNumber; k++){
            if(isExist(comparisonCards[k], userCards)){
                possess[k]++;
            }
        }

        Arrays.stream(possess)
                .forEach(result ->{
                    String count = String.format("%d ", result);
                    System.out.printf(count);
                });
    }

    private static boolean isExist(String comparisonCard, String[] userCards) {
        return Arrays.asList(userCards)
                .contains(comparisonCard);
    }
}
