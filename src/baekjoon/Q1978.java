package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int primeNum = 0;
		for(int k = 1; k <= n; k++) {

			int num = Integer.parseInt(st.nextToken());
			int cnt = 0;

			if(num > 1) {
				primeNum++;

				for(int i = 1; i < num; i++) {

					if(num % i == 0) cnt++;

					if(cnt == 2) {
						primeNum--;
						break;
					}
				}
			}

		}

		System.out.println(primeNum);
	}
}