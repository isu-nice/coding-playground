package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		
		int bag = -1;
		int n = total / 5;
		
		for(int i = n; i >= 1; i--) {
			
			int rest = total - 5*i;
			
			if(rest % 3 == 0) {
				bag = i + (rest / 3);
				break;
			}
		}
		
		// 5킬로그램 봉지가 필요없었던 경우
		if(bag == -1) {
			if(total % 3 == 0) {
				bag = total / 3;
			}
		}
		
		System.out.println(bag);
	}
}