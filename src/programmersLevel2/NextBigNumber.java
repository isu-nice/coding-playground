package programmersLevel2;

import java.util.ArrayList;

class NextBigNumber {
    public int solution(int n) {
        int answer = 0;
        int num = n;

        ArrayList<Integer> list = new ArrayList<>();

        while (num == 1) {
            if (num % 2 == 0) {
                list.add(0);
                num /= 2;
            } else {
                list.add(1);
                num = (num - 1) / 2;
            }
        }
        list.add(1);


        //System.out.println(Arrays.toString(list));

        return answer;
    }
}