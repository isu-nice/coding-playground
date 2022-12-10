package programmersLevel2;

class MatrixMultiple {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int arrLen = arr1[0].length;
        int arr1Len = arr1.length;
        int arr2Len = arr2[0].length;
        int sum = 0;
        answer = new int[arr1Len][arr2Len];


        for (int l = 0; l < arr1Len; l++) {
            for (int n = 0; n < arr2Len; n++) {
                for (int m = 0; m < arrLen; m++) {
                    sum += arr1[l][m] * arr2[m][n];
                }
                answer[l][n] = sum;
                sum = 0;
            }
        }

        return answer;
    }
}