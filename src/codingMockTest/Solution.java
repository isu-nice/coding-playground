package codingMockTest;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int num = 0;
        int skip = -1;
        
        for(int i = 0; i < n; i++) {
        	
        	int max = 0;
        	
        	for(int j = 0; j < 4; j++) {
        		
        		if (j == skip) continue;
        		
        		max = lineMax(land[i][j]);
        	}
        	skip = num;
        	answer += max;
        }
        return answer;
    }
    
    public int lineMax(int i) {
    	int lineMax = 0;
    	if (i >= lineMax) {
			lineMax = i;
    	}
    	
    	return lineMax;
    }
    
}