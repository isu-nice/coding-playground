package programmersLevel2;

import java.util.Stack;

class CorrectParentheses {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> temp = new Stack<>();
        //처음이 )이거나 끝이 (이면 false
        if (s.charAt(0) == ')'
                || s.charAt(s.length() - 1) == '(')
            return false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                temp.push('(');
            } else {
                //pop할 ( 가 없으면 false
                if (!temp.isEmpty()) {
                    temp.pop();
                } else return false;
            }
        }
        //개수 다르면 false
        if (temp.isEmpty()) answer = false;

        return answer;
    }
}
