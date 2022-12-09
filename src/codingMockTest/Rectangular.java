package codingMockTest;

import java.util.Arrays;

class Rectangular {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
        	x[i] = v[i][0];
        	y[i] = v[i][1];
        }
       
        answer[0] = coordinate(x);
        answer[1] = coordinate(y);
        
        return answer;
    }
    
    public int coordinate(int[] coordi) {
    	Arrays.sort(coordi);
    	
    	if(coordi[0] == coordi[1]) return coordi[2];
    	else return coordi[0];
    }
}