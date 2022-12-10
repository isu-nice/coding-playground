package programmersLevel1;

class LottoRanking {
    public int[] solution(int[] lottos, int[] win_nums) {
        
		int count = 0; int zero = 0;

		for(int i = 0; i < lottos.length; i++) {
			for(int j = 0; j < lottos.length; j++) {
				if(lottos[i] == win_nums[j]) {
					count++;
				}
			}
			if (lottos[i] == 0) {
				zero++;
			}
		} 

		int rank_max = 7 - (count + zero);
		int rank_min = 7 - count;

		if(rank_max == 7) {rank_max = 6;}
		if(rank_min == 7) {rank_min = 6;}

		int[] answer = {rank_max, rank_min};
		//System.out.println(Arrays.toString(answer));

		return answer;
	}
    
    
}