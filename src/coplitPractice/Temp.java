package coplitPractice;

import java.util.LinkedList;
import java.util.Queue;

public class Temp {
    public int paveBox(Integer[] boxes) {
        Queue<Integer> line = new LinkedList<>();
        //Collections.addAll(line, boxes);

        int max = 1;
        //int count = 1;
        //Integer num = line.poll();
        if (boxes.length <= 1) {
            return max;
        }

        line.add(boxes[0]);
        int num = boxes[1];

        for (int i = 2; i < boxes.length - 1; i++) {

            if (line.peek() > num) {
                line.add(boxes[i]);
                num += boxes[i];

                if (line.size() > max) {
                    max = line.size();
                }
            } else {
                line.clear();
                line.add(boxes[i]);
                num = boxes[i + 1];
            }
        }


/*        Integer nextNum = 0;

        while(!line.isEmpty()){
            if(num < line.peek()) {
                nextNum += line.poll();
                count++;

                if(count >= max) {
                    max = count;
                }
            }else{
                count = 1;
                num = line.poll();
            }
        }*/

        return max;
    }

}
