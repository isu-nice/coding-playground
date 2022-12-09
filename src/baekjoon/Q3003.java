package baekjoon;

import java.util.Scanner;

public class Q3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] piece = {1, 1, 2, 2, 2, 8};
		int[] find = new int[6];
		
		for(int i = 0; i < find.length; i++) {
			find[i] = sc.nextInt();
			
			System.out.print(piece[i] - find[i] + " ");
		}
		
		sc.close();
	}

}
