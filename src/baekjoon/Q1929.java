package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int start = Integer.parseInt(st.nextToken());
		int last = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		//에라토스테네스의 체
		boolean[] isPrime = new boolean[last+1];
		isPrime[0] = isPrime[1] = true;

		for(int i = 2; i <= last; i++) {
			if(isPrime[i]) continue; // 소수가 아니면 건너뜀 

			for(int j = 2*i; j <= last; j+=i) { // 소수라면 그의 배수들을 모두 제외시킴
				isPrime[j] = true;
			}

		}

		for(int i = start; i <= last; i++) {
			if(!isPrime[i]) sb.append(i + "\n");
		}

		System.out.println(sb);
	}

}