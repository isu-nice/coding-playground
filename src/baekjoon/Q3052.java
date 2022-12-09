package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		int num;
		
		for(int i = 1; i <= 10; i++) {
			num = Integer.parseInt(br.readLine());
			set.add(num % 42);
		}
		
		System.out.println(set.size());
	}

}
