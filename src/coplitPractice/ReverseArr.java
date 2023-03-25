package coplitPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArr {
    // 재귀 사용하는 방법
    public int[] reverseArr(int[] arr) {
        // 탈출 조건
        if (arr.length == 0) {
            return arr;
        }

        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] rest = reverseArr(Arrays.copyOf(arr, arr.length - 1));

        int[] result = new int[head.length + rest.length];
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(rest, 0, result, head.length, rest.length);

        return result;
    }


    // stream 사용하는 방법
    public int[] reverseArr2(int[] arr) {
        List<Integer> temp = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(temp);

        return temp.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
