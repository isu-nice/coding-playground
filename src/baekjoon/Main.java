package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 카운팅 정렬
		double mean;
		int median, mode, range;
		int[] arr = new int[n];
		int[] countingArr = new int[8001];

		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			countingArr[arr[i] + 4000]++;
		}

		int a = 0;
		int countingMax = 0;
		int[] sortedArr = new int[n];
		int[] sortedArrCount = new int[n];
		for(int i = 0; i < 8001; i++) {

			if(countingArr[i] >= 1) {
				sortedArrCount[a] = countingArr[i]; // sortedArrCount에 sortedArr의 중복횟수를 저장

				for(int cnt = 1; cnt <= countingArr[i]; cnt++) { // counting된 횟수만큼 sortedArr에 저장
					sortedArr[a] = i - 4000;
					a++;
				}

				if(countingArr[i] > countingMax) { // 중복횟수 max값 저장
					countingMax = countingArr[i];
				}
			}
		}

		// 최빈값 저장
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			if(sortedArrCount[i] == countingMax) {
				q.offer(sortedArr[i]);
			}
		}

		if(q.size() > 1) q.poll();

		br.close();
		mean = (double)sum / n;
		median = sortedArr[(n-1)/2];
		mode = q.peek();
		range = sortedArr[n-1] - sortedArr[0];

		System.out.println(Math.round(mean));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}
}