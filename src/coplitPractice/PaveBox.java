package coplitPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PaveBox {
    public int paveBox(Integer[] boxes) {
        // 배열의 요소를 큐에 담아줌
        Queue<Integer> line = new LinkedList<>(Arrays.asList(boxes));

        int max = 1;
        int count = 1;
        // 맨 앞 사람 할당
        int first = line.poll();

        // 큐가 빌 때까지 진행
        while(!line.isEmpty()){
            // 뒷 사람이 앞 사람보다 작은 경우 카운트 후 poll
            if (first >= line.peek()){
                count++;
                line.poll();

                // max 보다 크다면 max를 카운트로 지정
                max = Math.max(max, count);
            } else{ // 앞 사람이 뒷사람보다 작은 경우
                // 카운트 다시 1로
                count = 1;
                // first 다시 할당
                first = line.poll();
            }
        }

        return max;
    }
}
