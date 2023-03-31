package dailyCoding;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public String compressString(String str) {
        StringBuilder result = new StringBuilder();
        Queue<String> q = new LinkedList<>();

        // str을 한 글자씩 큐에 담아줌
        for (int i = 0; i < str.length(); i++) {
            q.add(String.valueOf(str.charAt(i)));
        }

        int count = 1;

        while (!q.isEmpty()) {
            String alphabet = q.poll();

            // 다음 글자와 알파벳이 같다면 카운트 +1
            if(alphabet.equals(q.peek())){
                count++;
            }else {
                // 카운트가 3이상인 경우만 압축
                if(count >= 3){
                    result.append(count)
                            .append(alphabet);
                } else{
                    // 그렇지 않은 경우는 카운트만큼 알파벳을 붙여줌
                    for(int i = 1; i <= count; i++){
                        result.append(alphabet);
                    }
                }

                // 카운트 다시 초기화
                count = 1;
            }
        }

        return result.toString();
    }
}