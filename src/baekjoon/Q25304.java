package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String answer;
		
		int total = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int price, num, sum = 0;
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			price = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			
			sum += price * num;
		}
		
		if(sum == total) answer = "Yes";
		else answer = "No";
		
		System.out.println(answer);
	}
}