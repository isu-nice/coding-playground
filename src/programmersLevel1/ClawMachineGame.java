package programmersLevel1;

import java.util.ArrayList;

class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int n = board[0].length;
        int claw;
        ArrayList<Integer> basket = new ArrayList<Integer>(moves.length);

        for (int move : moves) { // move마다 basket에 담기
            claw = move - 1;

            if (board[n - 1][claw] == 0) {// 인형이 없으면 크레인 작동하지 않음
                continue;
            } else {
                for (int j = 0; j < n; j++) {
                    if (board[j][claw] != 0) {
                        basket.add(board[j][claw]);

                        board[j][claw] = 0;
                        break;
                    }
                }
            }
            ;

        }

        int answer = 0;
        //int size = basket.size(); -> 런타임 에러 : 지정해주지말고 계속 변경되도록 해야함
        for (int a = 1; a < basket.size() + 1; ) { // basket 내 겹치는 부분 순서대로  모두 삭제
            //if(a!=(basket.size()-1)){
            if (basket.get(a) == basket.get(a - 1)) {
                basket.remove(a - 1);
                basket.remove(a - 1);
                a = a - 1;
                answer = answer + 2; // 카운트
            } else {
                a++;
            }

            System.out.println(a);
            System.out.println(basket.size());
        }
        return answer;
    }
}
