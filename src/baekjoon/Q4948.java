package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		while(n != 0) {
			sb.append(isPrime(n, 0)).append("\n");
			n = Integer.parseInt(br.readLine());
		}
		
		br.close();
		System.out.println(sb);
	}
	
	//에라토스테네스의 체
	static int isPrime(int num, int count) {
		
		boolean[] prime = new boolean[2*num + 1];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= num*2; i++) {
			if(prime[i]) continue; // 소수가 아니면 건너뜀 
			
			if(i > num && i <= num*2) count++; // n과 2n 사이의 소수 카운트
			
			for(int j = 2*i; j <= num*2; j+=i) { // 소수라면 그의 배수들을 모두 제외시킴
				prime[j] = true;
			}
		}
		
		return count;
	}

}