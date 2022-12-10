package programmersLevel2;

import java.util.HashMap;
import java.util.Map;

class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 0;
        int len = clothes.length;
        int cnt = 0;

        Map<String, Integer> name = new HashMap<>();
        Map<String, Integer> type = new HashMap<>();

        for (int i = 0; i < len; i++) {

            if (!type.containsKey(clothes[i][1])) {
                type.put(clothes[i][1], cnt);
                cnt++;
            }
            name.put(clothes[i][0], i);
        }

        //answer = cnt


        return answer;
    }
}