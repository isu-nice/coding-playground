package programmersLevel1;

import java.util.ArrayList;
import java.util.Collections;

class MockTest {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int len = answers.length;
		ArrayList<Integer> first =  new ArrayList<Integer>(len);
		ArrayList<Integer> second =  new ArrayList<Integer>(len);
		ArrayList<Integer> third =  new ArrayList<Integer>(len);

		//1번
		int f = 1;
		do {
			int num = f % 5;

			if (num == 0) first.add(5);
			else first.add(num);

			f++;
		}while (f <= len) ;

		//2번
		int s = 0;  int i = 1;
		int[] num2 = {1,3,4,5};
		do {

			if (s%2 != 0) {
				if (i%4 == 0) second.add(5);
				else {
					second.add(num2[i%4 -1]);
				}
				i++; s++;
			}
			else {
				second.add(2);
				s++;
			}
		}while (s < len) ;

		//3번
		int t = 0; int k = 1;
		do {
			int rest = k % 10;

			switch(rest) {
			case 1: case 2:
				third.add(3); break;
			case 3: case 4:
				third.add(1); break;
			case 5: case 6:
				third.add(2); break;
			case 7: case 8:
				third.add(4); break;
			case 9: case 0:
				third.add(5); break;
			}
			t++; k++;
		}while (t < len) ;

		//채점
		ArrayList<Integer> corr =  new ArrayList<Integer>(3);
		
		int c1 = 0; int c2 = 0; int c3 = 0;
		for (int a = 0; a < len; a++) {
			if(first.get(a).equals(answers[a])) c1++;
			if(second.get(a).equals(answers[a])) c2++;
			if(third.get(a).equals(answers[a])) c3++; 
		}
		corr.add(0, c1);
		corr.add(1, c2);
		corr.add(2, c3);

		//등수 -> corr의 최댓값 출력
		int max = Collections.max(corr);
		ArrayList<Integer> temp =  new ArrayList<Integer>();
		
		for (int b = 0; b < corr.size(); b++) {
			if (corr.get(b) == max)  temp.add(b+1);
		}
		
		answer = temp.stream()
				.mapToInt(Integer::intValue)
				.toArray();
		
		return answer;
	}
}