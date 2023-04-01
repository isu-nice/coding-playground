package coplitPractice;
// TODO 패키지 밑으로 복사

import java.util.*;

public class Solution {
    public int partTimeJob(int k) {
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        int num = 0;

        for (int coin : coins) {
            if(k == 0) {
                break;
            }

            int count = k / coin;
            num += count;
            k -= (coin * count);
        }

        return num;
    }
}

