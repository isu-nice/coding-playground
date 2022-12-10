package programmersLevel2;

class MaxMin {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");

        int max = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[0]);

        for (int i = 0; i < temp.length; i++) {
            int num = Integer.parseInt(temp[i]);
            if (num >= max) max = num;
            if (num <= min) min = num;
        }
        answer = min + " " + max;
        return answer;
    }
}