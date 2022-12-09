package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
 
public class Q1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashSet<Character> set = new HashSet<>();
		int count = n;
		
		for(int i = 1; i <= n; i++) {
			String word = br.readLine();
			set.add(word.charAt(0));
			
			for(int a = 1; a < word.length(); a++) {
				
				if(word.charAt(a-1) == word.charAt(a)) {
					set.add(word.charAt(a));
				}else {
					
					if(!set.contains(word.charAt(a))) {
						set.add(word.charAt(a));
					}else {
						count--;
						break;
					}
				}
			}
			set.clear();
		}
			
		System.out.println(count);
	}
}