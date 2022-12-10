package programmersLevel1;

public class InsufficientMoney {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long fee = 0;
        	
        for(int i = 1; i <= count; i++) {
        	fee += (long)price*i;
        }
        
        if(money >= fee) answer = 0;
        else answer = fee - money;
        
        return answer;
    }

}
