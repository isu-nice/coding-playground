package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int sec = word.length();

        for (int i = 0; i < word.length(); i++) {

            switch (word.charAt(i)) {
                case 'A', 'B', 'C' -> sec += 2;
                case 'D', 'E', 'F' -> sec += 3;
                case 'G', 'H', 'I' -> sec += 4;
                case 'J', 'K', 'L' -> sec += 5;
                case 'M', 'N', 'O' -> sec += 6;
                case 'P', 'Q', 'R', 'S' -> sec += 7;
                case 'T', 'U', 'V' -> sec += 8;
                case 'W', 'X', 'Y', 'Z' -> sec += 9;
            }
        }

        System.out.println(sec);
    }
}

