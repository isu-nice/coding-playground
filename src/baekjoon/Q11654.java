package baekjoon;

import java.util.Scanner;

public class Q11654 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        sc.close();

        char ascii = answer.charAt(0);

        System.out.println((int) ascii);
    }
}