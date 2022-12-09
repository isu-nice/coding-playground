package baekjoon;

import java.io.*;

public class Q2941 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String a : croatian) {
			if(word.contains(a)) {
				word = word.replaceAll(a, "e");
			}
		}
 
		System.out.println(word.length());
	}
}

