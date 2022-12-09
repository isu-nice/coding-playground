package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		int rest = (minute + time) % 60;
		hour += (minute + time - rest) / 60;
		minute = rest;
		
		if (hour >= 24) hour = hour - 24;
		
		System.out.println(hour + " " + minute);
	}
}