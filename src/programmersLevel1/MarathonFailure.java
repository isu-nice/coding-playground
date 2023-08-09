package programmersLevel1;

import java.util.Arrays;

public class MarathonFailure {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int n = completion.length;

        for (int i = 0; i < n; i++) {

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        answer = participant[n];
        return answer;
    }
}
