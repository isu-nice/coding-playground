package programmersLevel2;

class LeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = 0;
        int resultLcm = arr[0];
        int resultGcm = 0;

        for (int i = 1; i < arr.length; i++) {
            int a = resultLcm;
            int b = arr[i];

            resultGcm = gcm(a, b);
            resultLcm = (a * b) / resultGcm;
        }

        answer = resultLcm;
        return answer;
    }

    public int gcm(int a, int b) {
        int r = -1;

        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return b;
    }
}