package baekjoon;

import java.util.Scanner;

public class Q10430 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = A % C;

        System.out.println((A + B) % C);
        System.out.println(((D) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println((D * (B % C)) % C);

        sc.close();
    }

}
