package dailyCoding;

import java.util.HashMap;

public class TransformFirstAndLast {
    public HashMap<String, String> transformFirstAndLast(String[] arr) {
        HashMap<String, String> result = new HashMap<>();

        int arrLength = arr.length;

        if (arrLength == 0) {
            return null;
        }

        result.put(arr[0], arr[arrLength - 1]);

        return result;
    }
}
