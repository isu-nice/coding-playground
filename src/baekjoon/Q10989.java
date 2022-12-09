package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		// 카운팅 정렬
		int[] arr = new int[n];
		int[] countingArr = new int[10001];

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			countingArr[arr[i]]++;
		}

		for(int i = 1; i <= 10000; i++) {

			if(countingArr[i] >= 1) {
				// countingArr에 저장된 횟수만큼 반복해서 출력해줌
				sb.append((i + "\n").repeat(countingArr[i]));
			}
		}

		br.close();
		System.out.println(sb);
	}
}