package dailyCoding;

import java.util.HashMap;

public class ConvertListToHashMap {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> result = new HashMap<>();

        for (String[] strings : arr) {
            if (strings.length == 0) {
                continue;
            }
            if (result.containsKey(strings[0])) {
                continue;
            }
            result.put(strings[0], strings[1]);
        }

        return result;
    }
}
