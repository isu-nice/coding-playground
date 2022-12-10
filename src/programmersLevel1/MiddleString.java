package programmersLevel1;

class MiddleString {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int mid = len/2;
        int even = (len-1)/2;
        
        if(len%2 == 0) {
        	answer = s.substring(mid-1, mid+1);
        }else {
        	answer = s.substring(even, even+1);
        }
        
        return answer;
    }
}
