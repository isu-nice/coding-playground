package programmersLevel2;

class PlainSquare {
    public long solution(int w, int h) {
        long answer = 0;
        long temp = 0;

        if (w == h) {
            answer = (long) w * h - h;
            return answer;
        } else {
            for (int i = 1; i <= w; i++) {
                long col = (long) h * i;
                temp = (long) h - (long) Math.floor((double) col / w);
                answer += temp;
            }
            return answer * 2;
        }
    }
}

//정답풀이

//class Solution {
//
//    public long solution(int w, int h) {
//        long count = 0;
//        for(int x=0; x<w; x++){
//            count += Math.ceil((double)h*(x+1)/w)-Math.floor((double)h*x/w);
//        }
//        return (long)h*w-count;
//    }
//}