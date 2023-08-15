package coplitPractice;

import java.util.Arrays;

public class ConnectedVertices {
    public int connectedVertices(int[][] edges) {
        int group = 0;

        // 최대 edge를 구한다.
        int max = 0;
        for (int[] edge : edges) {
            int edgeMax = Arrays.stream(edge).reduce(max, Integer::max);
            max = Math.max(edgeMax, max);
        }

        /* 최대값 구하는 방법 2
        final int[] max = {0};
        Arrays.stream(edges)
                .forEach(line -> {
                    int biggest = Arrays.stream(line)
                            .boxed()
                            .max(Integer::compareTo)
                            .orElse(0);

                    if (biggest > max[0]) {
                        max[0] = biggest;
                    }
                });
        */

        // 간선 정보를 입력한다.
        int[][] matrix = new int[max + 1][max + 1];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];

            matrix[from][to] = 1;
            matrix[to][from] = 1;
        }

        // 방문 여부를 담을 배열 선언
        boolean[] visited = new boolean[max + 1];

        for (int vertex = 0; vertex < visited.length; vertex++) {
            // 끊긴 구간이 있을 때 그룹 +1 해준다.
            if (!visited[vertex]) {
                group++;
                dfs(visited, matrix, vertex);
            }
        }

        return group;
    }

    public void dfs(boolean[] visited, int[][] matrix, int vertex) {
        // 방문 체크
        visited[vertex] = true;

        for (int i = 0; i < matrix.length; i++) {
            // 방문하지 않았고, 간선이 연결되어 있는 경우
            if (!visited[i] && matrix[vertex][i] == 1) {
                // 그 자리부터 다시 탐색
                dfs(visited, matrix, i);
            }
        }
    }
}
