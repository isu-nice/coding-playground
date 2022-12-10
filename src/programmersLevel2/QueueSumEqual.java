package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

class QueueSumEqual {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        int sum = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        //int[] q = {};

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            sum += queue1[i] + queue2[i];
        }

        if (sum % 2 != 0) return -1;

        //int[] q = queue1 + queue2;

        int target = sum / 2;
        sumEqual(0, target, 0);


        return answer;
    }

    void sumEqual(int num, int target, int cnt) {
    }

}