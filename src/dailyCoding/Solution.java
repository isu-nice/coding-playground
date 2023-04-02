package dailyCoding;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public int largestProductOfThree(int[] arr) {
        // 배열 정렬해줌
        Arrays.sort(arr);

        // case1 : 제일 첫 요소 두 개 곱한 것과 제일 마지막 요소 곱하는 경우
        int answer1 = arr[0] * arr[1] * arr[arr.length - 1];

        // case2 : 제일 큰 요소 세개를 곱하는 경우
        int answer2 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

        // 둘 중에 더 큰 것이 정답
        return Math.max(answer1, answer2);
    }



}