package dailyCoding;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public boolean balancedBrackets(String str) {
        Stack<Character> box = new Stack<>();

        HashMap<Character, Character> bracket = new HashMap<>();
        bracket.put('(', ')');
        bracket.put('[', ']');
        bracket.put('{', '}');

        String last = ")]}";

        for (int i = 0; i < str.length(); i++) {
            char part = str.charAt(i);
            // 해당 문자가 여는 괄호인 경우 스택에 담아줌
            if (bracket.containsKey(part)) {
                box.push(part);

                // 해당 문자가 닫는 괄호이고 스택이 비어있지 않다면
            } else if (last.indexOf(part) != -1 && !box.isEmpty()) {
                // 스택에서 꺼낸 여는 괄호와 닫는 괄호가 매칭되는지 확인
                char opener = box.pop();
                char closer = bracket.get(opener);

                if (part != closer) {
                    return false;
                }
            } else { // 스택이 비어있는데 해당 문자가 괄호 뒷부분인 경우
                return false;
            }
        }

        // 스택이 비어있지 않다면 짝이 맞지 않은 것 -> false
        return box.isEmpty();
    }
}
