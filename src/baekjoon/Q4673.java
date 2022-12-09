package baekjoon;

public class Q4673 {

	public static void main(String[] args) {

		boolean[] noSelfNum = new boolean[10001];

		for (int n = 1; n <= 10000; n++) {
			int num = d(n);

			// 셀프 넘버가 아닌 것은 true로 처리
			if (num <= 10000) {
				noSelfNum[num] = true;
			}
		}

		for (int i = 1; i <= 10000; i++) {
			if (!noSelfNum[i]) {
				System.out.println(i);
			}
		}

	}

	static int d(int num) {
		int sum = num;

		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}
}