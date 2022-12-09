package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			
			answer += count(i);
		}
		
		System.out.println(answer);
	}
	
	static int count(int num) {
		String n = Integer.toString(num); 
		int len = n.length();
		int[] diff = new int[len-1]; 
		
		if(num < 10) return 1;
		else {
			diff[0] = Character.getNumericValue(n.charAt(0)) 
						- Character.getNumericValue(n.charAt(1));
		}
		
		for(int i = 1; i < len-1; i++) {
			diff[i] = Character.getNumericValue(n.charAt(i)) 
						- Character.getNumericValue(n.charAt(i+1));
			
			if(diff[i] != diff[i-1]) return 0;
			
		}
		
		return 1;
	}
}