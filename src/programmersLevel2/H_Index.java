package programmersLevel2;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;

        for (int h = 1; h <= citations.length; h++) {
            int cnt = 0;

            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= h) cnt++;
            }

            if (cnt > h) answer = Math.max(answer, h);
        }

        return answer;
    }
}
