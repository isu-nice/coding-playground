package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2751 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 제한숫자 1,000,000의 두 배를 담을 수 있는 boolean 배열 만든다음
		// 체크해서 순서대로 출력해줌 ( 중복이 없기 때문)
		
		int n = Integer.parseInt(br.readLine());
		boolean[] readyArr = new boolean[2000001];
		
		int num;
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			readyArr[num + 1000000] = true; // 음수도 담을 수 있는 방법
		}
		
		for(int i = 0; i < 2000001; i++) {
			if(readyArr[i]) sb.append(i - 1000000).append("\n");
		}
	
		br.close();
		System.out.println(sb);
	}
}