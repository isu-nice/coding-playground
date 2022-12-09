package codingMockTest;

import java.util.Arrays;

class Cut {
    public int solution(int[][] beginning, int[][] target) {
        int answer = -1;
        int len = beginning.length;
        
        for (int i = 0; i < len; i++){
            if (beginning[1][i] == 0) beginning[1][i] = 1;
            else beginning[1][i] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 1; } 

        for (int j = 0; j < len; j++){
            if (beginning[3][j] == 0) beginning[3][j] = 1;
            else beginning[3][j] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 2; } 
        
        for (int j = 0; j < len; j++){
            if (beginning[3][j] == 0) beginning[3][j] = 1;
            else beginning[3][j] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 2; } 
        
        for (int j = 0; j < len; j++){
            if (beginning[j][1] == 0) beginning[j][1] = 1;
            else beginning[j][1] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 3; } 
                
        for (int j = 0; j < len; j++){
            if (beginning[j][3] == 0) beginning[j][3] = 1;
            else beginning[j][3] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 4; } 
        
        for (int j = 0; j < len; j++){
            if (beginning[j][4] == 0) beginning[j][4] = 1;
            else beginning[j][4] = 0;
        }
        if(Arrays.deepEquals(target, beginning)){
            return answer = 5; } 
            

        return answer;
    }
}




//import java.util.ArrayList;
//
//class Solution {
//    public String solution(String X, String Y) {
//        String answer = "";
//
//        String[] xArr = X.split("");
//        String[] yArr = Y.split("");
//        int temp = -1;
//
//        for (int i = 0; i < xArr.length; i++){
//            for (int j = 0; j < yArr.length; j++){
//                
//            	if (xArr[i].equals(yArr[j])){
//                    answer += xArr[i];
//                    int cnt = Integer.parseInt(xArr[i]);
//                    temp += cnt;
//                }
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        if ((temp+1) == 0) answer = "0";
//        if (temp == -1) answer = "-1"; 
//        
//        return answer;
//    }
//}