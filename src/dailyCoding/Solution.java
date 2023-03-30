package dailyCoding;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public boolean isIsogram(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(i) == arr[k]) {
                    return false;
                }
            }
        }

        return true;
    }
}