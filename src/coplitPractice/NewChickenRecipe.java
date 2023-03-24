package coplitPractice;

import java.util.*;

public class NewChickenRecipe {
    public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // 사용할 수 없는 재료를 삭제하고 newList에 저장
        List<Integer> newList = new ArrayList<>();

        for (int stuff : stuffArr) {
            String number = String.valueOf(stuff);
            int count = 0;
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == '0') {
                    count++;
                }
            }
            if (count < 3) {
                newList.add(stuff);
            }
        }

        // 사용할 수 있는 재료가 없거나 사용해야 할 개수보다 적은 경우 null 반환
        if (newList.isEmpty() || newList.size() < choiceNum) {
            return null;
        }
        // 작은 숫자 -> 큰 숫자 정렬
        Collections.sort(newList);

        ArrayList<Integer[]> result = new ArrayList<>();
        boolean[] visited = new boolean[newList.size()];

        // 순열 사용
        result = permutation(choiceNum, 0, result, new Integer[newList.size()], newList, visited);

        return result;
    }

    public ArrayList<Integer[]> permutation(
            int target, int depth, ArrayList<Integer[]> result, Integer[] temp,
            List<Integer> stuff, boolean[] visited) {
        // 탈출 조건
        if (depth == target) {
            result.add(temp);
            return result;
        }

        for (int i = 0; i < stuff.size(); i++) {
            if (!visited[i]) {
                // 사용 여부 체크
                visited[i] = true;
                // 새로운 배열 선언 후 사용한 재료 담아줌
                Integer[] newArr = Arrays.copyOf(temp, depth + 1);
                newArr[depth] = stuff.get(i);

                result = permutation(target, depth + 1, result, newArr, stuff, visited);
                visited[i] = false;
            }
        }

        return result;
    }
}
