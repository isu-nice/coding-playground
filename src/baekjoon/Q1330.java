package baekjoon;

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int answer = A - B;
		
		if(answer > 0) System.out.println(">");
		else if(answer < 0) System.out.println("<");
		else System.out.println("==");

		sc.close();
	}
}
