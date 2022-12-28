package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = fibonacci(N);
        System.out.println(answer);

    }

    public static int fibonacci(int N) {

        if (N <= 1) return N;

        return fibonacci(N - 2) + fibonacci(N - 1);
    }
}