package programmersLevel2;

import java.util.LinkedList;
import java.util.Queue;

class MapShortestDistance {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int solution(int[][] maps) {
        int answer = 0;
        int rL = maps.length;
        int cL = maps[0].length;
        int[][] visited = new int[rL][cL];
        visited[0][0] = 1; // 시작 위치 방문체크

        route(maps, visited);
        answer = visited[rL - 1][cL - 1]; //도착지 값 입력

        if (answer == 0) answer = -1;

        return answer;
    }

    public void route(int[][] maps, int[][] visited) {
        int rL = maps.length;
        int cL = maps[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0}); //q에 0번째, 1번째 인덱스에 0 추가

        while (!q.isEmpty()) {
            int[] position = q.poll();
            int x = position[0];
            int y = position[1];

            //상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int px = x + dx[i];
                int py = y + dy[i];

                //범위 제한
                if (px >= 0 && px < rL && py >= 0 && py < cL) {
                    //방문 확인, 전진 가능여부 확인
                    if (visited[px][py] == 0 && maps[px][py] == 1) {

                        visited[px][py] = visited[x][y] + 1; //방문체크
                        q.add(new int[]{px, py});
                    }
                }
            }
        }
    }
}