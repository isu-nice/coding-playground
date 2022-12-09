package codingMockTest;

import java.util.Scanner;

class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String answer = "";
        
        for(int i = 1; i <= a; i++) {
        	for(int j = 1; j <= i; j++) {
        		answer += "*";
        	}
        	answer += "\n";
        }
        System.out.println(answer);
        sc.close();
    }
}