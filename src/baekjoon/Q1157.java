package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		char answer = '?';
		int[] count = new int[26];
		int max = -1;
		
		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i) - 'A']++;

			if(count[word.charAt(i) - 'A'] > max) {
				max = count[word.charAt(i) - 'A'];
				answer = word.charAt(i);
			}else if(count[word.charAt(i) - 'A'] == max){
				answer = '?';
			}

		}

		System.out.println(answer);
	}

}

