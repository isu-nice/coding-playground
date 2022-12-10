package programmersLevel1;

import java.util.Arrays;

class Budget {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		for(int i = 0; i < d.length; i++) {
			budget -= d[i];
			
			if (budget >= 0) answer += 1;
			else return answer;
		}

		return answer;
	}
}