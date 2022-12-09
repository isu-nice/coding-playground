package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String star = "*";
		String blank = " ";
		
		for(int i = 1; i <= n; i++) {
			String answer = "";
			
			for(int j = 1; j <= n-i; j++) answer += blank;
			for(int k = 1; k <= i; k++) answer += star;
			
			System.out.println(answer);
		}
		
	}
}