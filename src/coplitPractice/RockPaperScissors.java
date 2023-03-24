package coplitPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    public static ArrayList<String[]> rockPaperScissors(int rounds) {

        ArrayList<String[]> result = new ArrayList<>();

        result = permutation(rounds, 0, new String[rounds], result);

        for (String[] strings : result) {
            //System.out.println(Arrays.toString(strings));

        }

        return result;
    }

    public static ArrayList<String[]> permutation(int round, int depth, String[] nowPlay, ArrayList<String[]> result) {

        // 탈출 조건
        if (depth == round) {
            result.add(nowPlay);
            //System.out.println(Arrays.toString(nowPlay));
            return result;
        }

        String[] play = new String[]{"rock", "paper", "scissors"};

        for (int i = 0; i < play.length; i++) {
            String[] newArr = Arrays.copyOf(nowPlay, depth + 1);
            newArr[depth] = play[i];

            result = permutation(round, depth + 1, newArr, result);
        }

        return result;
    }

    public static void main(String[] args) {
        rockPaperScissors(3);
    }
}
