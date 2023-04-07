package dailyCoding;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    // 방법 1: dynamic with memorization -> 0(N)
    public int fibonacci_1(int num) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        return compute(list, num);
    }

    public int compute(List<Integer> list, int num) {
        if (list.size() <= num) {
            list.add(compute(list, num - 1) + compute(list, num - 2));
        }

        return list.get(num);
    }


    // 방법 2: 재귀 -> 0(2^N)
    // 이미 해결한 문제의 정답은 기록해두고 다시 해결하지 않는 기법
    public int fibonacci_2(int num) {
        if(num <= 1) {
            return num;
        }

        return fibonacci_2(num - 1) + fibonacci_2(num - 2);
    }
}
