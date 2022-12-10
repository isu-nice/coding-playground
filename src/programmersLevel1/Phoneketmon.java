package programmersLevel1;

import java.util.HashSet;

public class Phoneketmon {
	public int solution(int[] nums) {
		int answer = 0;
		
		//중복 요소 제거를 위해 HashSet 사용
		HashSet<Integer> numsHash = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numsHash.add(nums[i]);
		}

		if (numsHash.size() > nums.length/2) {
			answer = nums.length/2;
		} else
			answer = numsHash.size();

		return answer;
	}
}
