package programmersLevel1;

class GymSuit {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] student = new int[n];
		
		// student배열에 모두 1 삽입
		for (int i = 0; i < n; i++) 
			student[i] = 1; 
		// 체육복 도난당한 학생에 -1
		for(int i = 0; i < lost.length; i++) 
			student[lost[i]-1]--; 
		// 여벌의 체육복 있는 학생에 +1
		for(int i = 0; i < reserve.length; i++) 
			student[reserve[i]-1]++;  

		for(int i = 1; i < n-1; i++) {
			//첫번째 학생 체육복이 없을 경우
			if (student[0] == 0) {
				if(student[1] == 2) {
					student[0]++;
					student[1]--;
				}
			}
			//마지막 학생 체육복이 없을 경우
			if (student[n-1] == 0) {
				if(student[n-2] == 2) {
					student[n-1]++;
					student[n-2]--;
				}
			}
			//나머지 학생들 체육복이 없을 경우
			if (student[i] == 0) {
				if (student[i-1] == 2)  {
					student[i]++;
					student[i-1]--;
					continue;
				}
				if (student[i+1] == 2) {
					student[i]++;
					student[i+1]--;
					continue;
				}
			}
		}
		//체육복 없는 학생 카운트
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (student[i] == 0) count++;
		}
		answer = n - count;

		return answer;
	}
}   