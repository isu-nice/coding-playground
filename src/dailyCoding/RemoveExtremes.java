package dailyCoding;

public class RemoveExtremes {
    public String[] removeExtremes(String[] arr) {
        if (arr.length == 0) {
            return null;
        }

        int max = 1;
        int min = 20;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length();

            // 같은 경우도 포함하면 제일 마지막 인덱스가 도출됨
            if (length >= max) {
                max = length;
                maxIndex = i;
            }
            if (length <= min) {
                min = length;
                minIndex = i;
            }
        }

        String[] result = new String[arr.length - 2];
        int resultIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == maxIndex || i == minIndex) {
                continue;
            }
            result[resultIndex] = arr[i];
            resultIndex++;
        }

        return result;
    }
}
