package programmersLevel2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;

        Queue<Integer> q = new LinkedList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(i, priorities[i]);
            q.offer(i);
        }

//        System.out.println(map.get(0));

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            int num = map.get(q.peek());
            for (int i : priorities) {
                if (num > i) {
                    q.offer(num);
                    answer++;
                    break;
                }
            }
            q.poll();
        }

        return answer;
    }
}