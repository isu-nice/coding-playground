package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int sec = word.length();
		
		for(int i = 0; i < word.length(); i++) {
			
			switch(word.charAt(i)){
			
			case 'A': case 'B': case 'C':
				sec += 2;
				break;
			case 'D': case 'E': case 'F':
				sec += 3;
				break;
			case 'G': case 'H': case 'I':
				sec += 4;
				break;
			case 'J': case 'K': case 'L':
				sec += 5;
				break;
			case 'M': case 'N': case 'O':
				sec += 6;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				sec += 7;
				break;
			case 'T': case 'U': case 'V': 
				sec += 8;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				sec += 9;
				break;
			}
				
		}
		
		System.out.println(sec);
	}
}

