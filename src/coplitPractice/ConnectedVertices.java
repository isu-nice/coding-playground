package coplitPractice;

import java.util.Arrays;

public class ConnectedVertices {
    public int connectedVertices(int[][] edges) {
        // edges 중 가장 큰 수를 찾는다
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

        // 최대값을 배열의 길이로 지정
        int[][] paths = new int[max[0] + 1][max[0] + 1];

        // 간선을 연결해준다
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];

            paths[from][to] = 1;
            paths[to][from] = 1;
        }

        // 방문 배열 선언
        boolean[] visited = new boolean[max[0] + 1]; // 모두 false로 초기화됨
        int group = 0;

        for (int vertex = 0; vertex <= max[0]; vertex++) {
            // 끊기는 간선이 있을 때까지 탐색 -> 끊기면 그룹 + 1
            if (!visited[vertex]) {
                group++;
                visited = dfs(paths, vertex, visited);
            }
        }

        return group;
    }

    public boolean[] dfs(int[][] paths, int vertex, boolean[] visited) {
        // 방문 표시
        visited[vertex] = true;

        for (int i = 0; i < paths.length; i++) {
            // 경로가 존재하고 방문하지 않은 경우
            if (paths[vertex][i] == 1 && !visited[i]) {
                // 이어진 경로부터 다시 탐색
                dfs(paths, i, visited);
            }
        }

        // 이어진 길을 모두 순회한 후 방문여부 체크된 배열 리턴
        return visited;
    }
}
