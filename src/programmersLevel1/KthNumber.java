package programmersLevel1;

import java.util.Arrays;

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];
        
    	for (int n = 0; n < commands.length; n++) {
        	int i = commands[n][0];
        	int j = commands[n][1];
        	int k = commands[n][2];
        	
        	int num = j-i+1;
        	int[] temp = new int[num];
        	int cnt = 0;
        	
        	for (int a = i-1; a < j; a++) {
        		temp[cnt] = array[a];
        		cnt++;
        	}
        	
        	Arrays.sort(temp);
        	answer[n] = temp[k-1];
        }
        
        return answer;
    }
}