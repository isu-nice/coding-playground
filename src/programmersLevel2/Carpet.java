package programmersLevel2;

class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int block = brown + yellow;
        int h;

        for (int w = 2; w < block; w++) {
            if (block % w == 0) {
                h = block / w;

                if (w * h == block
                        && (w + h) * 2 - 4 == brown) {

                    answer[0] = h;
                    answer[1] = w;
                    break;
                }
            }
        }
        return answer;
    }
}