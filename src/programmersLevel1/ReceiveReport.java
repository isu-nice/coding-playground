package programmersLevel1;

import java.util.*;

class ReceiveReport {
    public int[] solution(String[] id_list, String[] report, int k) {
        int users = id_list.length;
    	int[] answer = new int[users];
        
        //report 중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for(String rep : report) {
        	reportSet.add(rep);
        } 
        
        //id_list와 신고된 횟수 초기화한 값 HashMap에 넣어줌
        HashMap<String, Integer> cnt = new HashMap<>();
        HashMap<String, Integer> userID = new HashMap<>();
        for(int i = 0; i < users; i++) {
        	cnt.put(id_list[i], 0);
        	userID.put(id_list[i], i);
        }
        
        //신고된 횟수 카운트
        for(String rep : reportSet) {
        	String[] id = rep.split(" ");
        	cnt.put(id[1], cnt.get(id[1])+1);
        }
        	
      //k번 이상 신고된 유저를 신고한 유저에 메일
        for(String rep : reportSet) {
        	String[] id = rep.split(" ");
        	if(cnt.get(id[1]) >= k) answer[userID.get(id[0])]++;
        }
        	        
        return answer;
    }
}