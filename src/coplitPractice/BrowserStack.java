package coplitPractice;

import java.util.ArrayList;
import java.util.Stack;

public class BrowserStack {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        final String PREV = "-1";
        final String NEXT = "1";

        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.push(start);

        for (String action : actions) {
            String currentPage = current.peek();

            if (action.equals(PREV)) {
                if (!prevStack.isEmpty()) {
                    nextStack.push(currentPage);
                    current.pop();
                    String prev = prevStack.pop();
                    current.push(prev);
                }
            } else if (action.equals(NEXT)) {
                if (!nextStack.isEmpty()) {
                    prevStack.push(currentPage);
                    current.pop();
                    String next = nextStack.pop();
                    current.push(next);
                }
            } else { // 새로운 페이지
                current.pop();
                prevStack.push(currentPage);
                current.push(action);
                nextStack.clear();
            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }
}
