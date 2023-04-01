package coplitPractice;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MovingStuff {
    public int movingStuff(int[] stuff, int limit) {
        Arrays.sort(stuff);

        // 모든 짐을 데크에 담아줌
        Deque<Integer> allStuff = new LinkedList<>();
        for (int weight : stuff) {
            allStuff.add(weight);
        }

        int boxCount = 0;

        while (!allStuff.isEmpty()) {
            // 제일 가벼운 짐은 일단 peek
            int minWeight = allStuff.peekFirst();
            // 제일 무거운 짐은 제한에 상관없이 매번 poll해주고 카운트 +1;
            int maxWeight = allStuff.pollLast();
            boxCount++;

            // 제일 무거운 짐과 제일 가벼운 짐을 더한 무게가 제한에 적합한 경우
            if (minWeight + maxWeight <= limit) {
                // 제일 가벼운 짐도 데크에서 삭제해준다.
                allStuff.pollFirst();
            }
        }

        return boxCount;
    }
}
