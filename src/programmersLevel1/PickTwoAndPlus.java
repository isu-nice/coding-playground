package programmersLevel1;

import java.util.Iterator;
import java.util.TreeSet;

class PickTwoAndPlus {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		
		TreeSet<Integer> set = new TreeSet<>();

		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		Iterator<Integer> print = set.iterator();
		answer = new int[set.size()];
		
		for(int k = 0; k < set.size(); k++) {
			answer[k] = print.next();
		}
		
		return answer;
	}
}