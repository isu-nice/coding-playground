package programmersLevel2;

class TargetNumber {
    int answer = 0;

    void cal(int[] numbers, int depth, int val, int target) {
        int n = numbers.length;

        if (depth == 0) {
            if (val == target) answer++;

        } else {
            cal(numbers, depth - 1, val - numbers[n - depth], target);
            cal(numbers, depth - 1, val + numbers[n - depth], target);
        }
    }

    public int solution(int[] numbers, int target) {
        cal(numbers, numbers.length, 0, target);
        return answer;
    }
}