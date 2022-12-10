package programmersLevel2;

import java.util.HashSet;

class FindPrimeNumber {
    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];

        pieces(numbers, "", visited);

        answer = set.size();
        return answer;
    }

    public void pieces(String numbers, String num, boolean[] visited) {
        String[] card = numbers.split("");

        if (num != "") {
            int val = Integer.parseInt(num);
            if (isPrime(val)) set.add(val);
        }
        if (num.equals(numbers)) return;

        for (int i = 0; i < card.length; i++) {

            if (!visited[i]) {
                visited[i] = true;
                pieces(numbers, num + card[i], visited);
                visited[i] = false;
            }
        }
    }

    public boolean isPrime(int val) {
        if (val == 0 || val == 1) return false;

        for (int i = 2; i < val; i++) {
            if (val % i == 0) return false;
        }

        return true;
    }
}