package programmersLevel2;

class LongJump {
    public long solution(int n) {
        long answer = 0;

        long[] arr = new long[2001];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= 2000; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }

        answer = arr[n];
        return answer;
    }
}


//dfs는 시간초과 오류

//class Solution {
//	long answer = 0;
//
//	void dfs(int val, int n) {
//
//		if(val >= n) {
//			if(val == n) answer++;
//		}else {
//			dfs(val+1, n);
//			dfs(val+2, n);
//		}
//	}
//
//	public long solution(int n) {
//		dfs(0, n);
//		
//		return answer % 1234567;
//	}
//}
