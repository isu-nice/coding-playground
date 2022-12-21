package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4153 {
    private static final int NUMBER_OF_SIDES = 3;
    private static final String RIGHT_SIGN = "right" + "\n";
    private static final String WRONG_SIGN = "wrong" + "\n";

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder signs = new StringBuilder();

        String lengths = console.readLine();
        int[] sideLengths = getSideLengths(lengths);

        while (!isExitSignal(sideLengths)) {
            if (isRightTriangle(sideLengths)) {
                signs.append(RIGHT_SIGN);
            } else {
                signs.append(WRONG_SIGN);
            }
            lengths = console.readLine();
            sideLengths = getSideLengths(lengths);
        }

        System.out.print(signs);
        console.close();
    }

    private static boolean isExitSignal(int[] sideLengths) {
        return Arrays.stream(sideLengths).sum() == 0;
    }

    private static boolean isRightTriangle(int[] sideLengths) {
        Arrays.sort(sideLengths);
        double maxSide = Math.pow(sideLengths[2], 2);
        double remainingSide = Math.pow(sideLengths[0], 2) + Math.pow(sideLengths[1], 2);
        return maxSide == remainingSide;
    }

    private static int[] getSideLengths(String lengths) {
        StringTokenizer tokenizer = new StringTokenizer(lengths);

        int[] sideLengths = new int[NUMBER_OF_SIDES];
        for (int i = 0; i < NUMBER_OF_SIDES; i++) {
            sideLengths[i] = Integer.parseInt(tokenizer.nextToken());
        }
        return sideLengths;
    }
}
