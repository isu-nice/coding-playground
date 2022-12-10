package programmersLevel1;

class PrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        int sum = 0;
        
        for(int i = 0; i < len; i++) {
        	for(int j = i+1; j < len; j++) {
        		for(int k = j+1; k < len; k++) {
        			sum = nums[i] + nums[j] + nums[k];
        			answer += isPrime(sum);
        		}
        	}
        }
        
        return answer;
    }
    
    public int isPrime(int sum) {
    	int cnt = 0;
    	int answer = 0;
    	
    	for(int i = 2; i <= sum; i++) {
        	if (sum % i == 0) cnt++;
        }
        
    	if (cnt == 1) answer = 1;
    	return answer;
    }
}