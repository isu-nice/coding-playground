package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> num = new Stack<>();
		
		int sum = 0;
		for(int i = 1; i <= k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				num.pop();
			}else {
				num.push(n);
			}
		}
		
		while(!num.isEmpty()) {
			sum += num.pop();
		}
		
		System.out.println(sum);
	}                                                                                                                                                                                                                                                                                                                                          
}