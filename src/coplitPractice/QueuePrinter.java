package coplitPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrinter {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // 큐(프린터기) 선언
        Queue<Integer> printer = new LinkedList<>();
        // 큐에 bufferSize 만큼 0 넣어서 초기화
        for (int i = 0; i < bufferSize; i++) {
            printer.add(0);
        }

        // 초기 문서 인덱스와 시간 할당
        int docIndex = 0;
        int time = 0;

        // 큐가 빌 때까지 진행
        while (!printer.isEmpty()) {
            // 매 반복마다 해야하는 것
            printer.poll();
            time++;

            // 다음 문서가 있는 경우만 진행 (없는 경우 poll과 time++만 이루어짐)
            if (docIndex < documents.length) {
                // 큐의 총합 할당
                int printerSum = printer.stream().reduce(0, Integer::sum);

                // (큐의 총합 + 다음 문서) 가 capacities를 넘으면
                if (printerSum + documents[docIndex] > capacities) {
                    // 0 add
                    printer.add(0);
                } else { // 넘지 않는 경우
                    // 문서 push
                    printer.add(documents[docIndex]);
                    // 문서 인덱스 ++
                    docIndex++;
                }
            }
        }

        return time;
    }
}
