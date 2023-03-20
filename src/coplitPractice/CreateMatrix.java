package coplitPractice;

public class CreateMatrix {
    public int[][] createMatrix(int[][] edges) {
        // edges의 모든 요소 중에서 가장 큰 수를 행렬 크기로 지정
        int max = 0;
        for (int[] edge : edges) {
            for (int num : edge) {
                if (num > max) {
                    max = num;
                }
            }
        }

        // 배열 세팅
        int[][] graph = new int[max + 1][max + 1];

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int direction = edge[2];

            graph[from][to] = 1;

            // 무향(왕복)인 경우 도착과 시작을 바꾼 곳도 1로 표시
            if (direction == 1) {
                graph[to][from] = 1;
            }
        }
        return graph;
    }
}
