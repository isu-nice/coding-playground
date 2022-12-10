package programmersLevel2;

public class NumberRepresentation {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += contNum(i, n, 0);
        }

        return answer;
    }

    public int contNum(int start, int target, int sum) {

        for (int i = start; i <= target; i++) {
            sum += i;
            if (sum == target) return 1;
            if (sum > target) return 0;
        }
        return 0;
    }
}
