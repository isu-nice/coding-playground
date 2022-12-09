package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0, sum = 0, score;
		
		for(int i = 1; i <= n; i++) {
			score = Integer.parseInt(st.nextToken());
			sum += score;
			if(score > max) max = score;
		}
		
		double avg = (double)(sum*100)/(double)(max*n);
		
		System.out.println(avg);
	}

}
