package Chapter7;

import java.util.Scanner;

/**
 * 피보나치 수열
 * input
 10
 * output
 1 1 2 3 5 8 13 21 34 55
 */
class Problem4 {
	// 정적 배열
	static int[] fibo;

	// 1이나 2면 바로 return;
	public int solution(int n) {
		if (n == 1) return 1;
		else if (n == 2) return 1;
		else return solution(n - 2) + solution(n - 1);
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			System.out.print(T.solution(i) + " ");
		}
	}
}
