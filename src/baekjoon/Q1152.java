package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 공백을 기준으로 나눠준 토큰을 저장함
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		// countTokens 메소드 활용
		System.out.println(st.countTokens());
	}
}

