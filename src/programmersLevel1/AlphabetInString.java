package programmersLevel1;

import java.util.LinkedList;
import java.util.Queue;

class AlphabetInString {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        
        Queue<Character> q = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
        	q.add(s.charAt(i));
        }
        
        int cntP = 0;  int cntY = 0;
        for(int i = 0; i < len; i++) {
        	int alphabet = q.poll();
        	if(alphabet == 'p' || alphabet == 'P') cntP++;
        	if(alphabet == 'y' || alphabet == 'Y') cntY++;
        }
        
        if(cntP != cntY) return false; 
      
        return answer;
    }
    
}