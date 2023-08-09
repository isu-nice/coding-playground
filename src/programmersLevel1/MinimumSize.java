package programmersLevel1;

public class MinimumSize {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0;
        int h_max = 0;

        for (int[] len : sizes) {
            int w = Math.max(len[0], len[1]);
            int h = Math.min(len[0], len[1]);

            if (w > w_max) w_max = w;
            if (h > h_max) h_max = h;
        }

        answer = w_max * h_max;
        return answer;
    }
}
