package programmersLevel1;

class RemoveMinimum {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int len = arr.length;
		int min = arr[0];
		int a = 0;
		
		for(int i : arr) {
				if(i < min) min = i;
			}
		
		if (len != 1) {
			answer = new int[len-1];
			
			for(int i = 0; i < len-1; i++) {
				if (arr[a] == min) a++;
				answer[i] = arr[a];
				a++;
			}
			
		}else {
			answer = new int[1];
			answer[0] = -1;
		}

		return answer;
	}
}