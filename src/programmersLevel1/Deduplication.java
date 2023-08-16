package programmersLevel1;

import java.util.ArrayList;

public class Deduplication {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(arr[0]);

        int cnt = 0;
        for (int i = 1; i < len; i++) {
            if (!arrList.get(cnt).equals(arr[i])) {
                arrList.add(arr[i]);
                cnt++;
            }
        }

        answer = arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println(Arrays.toString(answer));

        return answer;
    }
}
