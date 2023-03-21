package coplitPractice;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public int paveBox(Integer[] boxes) {
        int max = 1;

        // 박스가 하나보다 적은 경우 그대로 1을 리턴
        if(boxes.length <= 1) {
            return max;
        }

        // 박스 배열을 큐에 모두 담아줌
        Queue<Integer> line = new LinkedList<>(Arrays.asList(boxes));

        int count = 1;
        int first = line.poll();

        // 대기줄이 모두 없어질 때까지 진행
        while(line.size() >= 1 && line.size() <= boxes.length) {
            // 맨 앞사람이 뒷 사람보다 큰 경우, 카운트 해주고 대기열에서 빼줌
            if(first >= line.peek()){
                count++;
                line.poll();

                // 카운트가 최댓값보다 크면 갱신해줌
                if(count > max) {
                    max = count;
                }
            } else {
                // 작은 경우 다시 처음부터 카운트해야하므로 초기화해줌
                count = 1;
                // 맨 앞사람은 다음 사람으로 초기화해줌
                first = line.poll();
            }
        }

        return max;
    }













    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        Queue<Integer> printer = new LinkedList<>();

        // 버퍼 0으로 채워주기
        for (int i = 0; i < bufferSize; i++) {
            printer.add(0);
        }

        int time = 0;
        int index = 0;

        while (!printer.isEmpty() && index < documents.length) {
            if (printer.peek() <= 0) {
                printer.poll();
                if (capacities > sumAll(printer) + documents[index]) {
                    printer.add(documents[index]);
                    index++;
                } else {
                    printer.add(0);
                }

            } else {
                printer = reduce(printer);
            }

            time++;
        }

        return time;
    }

    public Queue<Integer> reduce(Queue<Integer> printer) {
        Queue<Integer> temp = new LinkedList<>();
        for (Integer num : printer) {
            temp.add(num - 1);
        }
        return temp;
    }

    public int sumAll(Queue<Integer> printer) {
        return printer.stream().reduce(0, Integer::sum);
    }

}
