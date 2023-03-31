package coplitPractice;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public String barcode(int len) {
        return dfs("", len);
    }

    public String dfs(String answer, int len) {
        String[] nums = {"1", "2", "3"};

        // 탈출 조건
        if (answer.length() == len) {
            return answer;
        }

        for (int a = 0; a < nums.length; a++) {
            String temp = answer + nums[a];
            if (isValid(temp)) {
                String search = dfs(temp, len);
                if (search != null) {
                    return search;
                }
            }
        }

        return null;
    }

    public boolean isValid(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverseStr = builder.reverse().toString();

        for (int i = 1; i <= str.length() / 2; i++) {
            String sub = reverseStr.substring(0, i);
            String nextSub = reverseStr.substring(i, i + i);
            if (sub.equals(nextSub)) {
                return false;
            }
        }
        return true;
    }
}
