package baekjoon;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		if(M >= 45) {
			M -= 45; 
		}else {

			if(H == 0) H = 23;
			else H--;
			
			M = 60 - (45 - M);
		}

		System.out.println(H + " " + M);
	}
}