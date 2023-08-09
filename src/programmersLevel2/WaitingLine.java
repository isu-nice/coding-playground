package programmersLevel2;

class WaitingLine {
    boolean[] visited;

    public int[] solution(int n, long k) {
        visited = new boolean[n];
        int[] answer = new int[n];

        kth(n, k, 0, visited);

        return answer;
    }

    public int kth(int num, long target, long cnt, boolean[] visited) {

        if (cnt == target) return 0;

        for (int i = 0; i < num; i++) {
            if (!visited[i]) {
                visited[i] = true;
                kth(num, target, cnt++, visited);
                visited[i] = false;
            }
        }

        return 0;
    }
}