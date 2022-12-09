package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int last = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = last;

		for(int i = start; i <= last; i++) {

			if(i == 2) {
				sum += i;
				if(i <= min) min = i;
			}
			if(i % 2 != 0) { // 짝수 먼저 걸러줌
				if(isPrime(i)) {
					sum += i;
					if(i <= min) min = i;
				}
			}

		}

		if(sum == 0) System.out.println("-1");
		else System.out.println(sum + "\n" + min);
	}

	static boolean isPrime(int num) {
		if(num == 1) return false;

		for(int i = 3; i < num; i++) { // 짝수 제외했으므로 3부터 나눠줌
			if(num % i == 0) return false;
		}

		return true;
	}
}