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
        //

        List<String> possess = compareCards(userCards, comparisonCards);
        printComparingResult(possess);
    }

    private static List<String> compareCards(String[] userCards, String[] comparisonCards){
        List<String> possess = new ArrayList<>();
        Arrays.stream(comparisonCards)
                .forEach(comparisonCard -> {
                    if (isExist(comparisonCard, userCards)) {
                        possess.add("1");
                    } else {
                        possess.add("0");
                    }
                });
        return possess;
    }

    private static boolean isExist(String comparisonCard, String[] userCards) {
        return Arrays.asList(userCards)
                .contains(comparisonCard);
    }

    private static void printComparingResult(List<String> possess) {
        String result = String.join(" ", possess);
        System.out.println(result);
    }
}
