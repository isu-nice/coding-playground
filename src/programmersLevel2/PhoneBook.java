package programmersLevel2;

import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int len = phone_book.length;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {

                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return answer;
    }
}