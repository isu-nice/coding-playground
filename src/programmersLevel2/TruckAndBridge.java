package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

class TruckAndBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weight_sum = 0;

        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> bridge = new LinkedList<Integer>();

        // 각 트럭의 무게를 큐에 넣어줌
        for (int i : truck_weights) {
            q.offer(i);
        }
        // bridge 한 칸마다 빈공간(0) 채워 넣음
        for (int i = 1; i <= bridge_length; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) { // bridge가 완전히 빌 때까지
            // 매 초 bridge맨 앞을 빼줌
            answer++;
            weight_sum -= bridge.poll();

            if (!q.isEmpty()) { // 트럭이 모두 지나갈 때까지
                int truck = q.peek();

                // 제한 무게를 초과하지 않으면 트럭을 지나가게 함
                if (weight_sum + truck <= weight) {
                    bridge.offer(truck);
                    weight_sum += truck;
                    q.poll();
                }
                // 그렇지 않으면 빈공간(0)을 넣음
                else bridge.offer(0);
            }
        }

        return answer;
    }
}