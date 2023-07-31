package Chapter7;

import java.util.Scanner;

/**
 * 피보나치 수열
 * input
 10
 * output
 1 1 2 3 5 8 13 21 34 55
 * 재귀보다 for 문으로 돌리는 것이 더 성능 면으로는 좋다.
 * 이유는 재귀에 스택 프레임이 돌아가 메모리가 너무 사용된다.
 */




class Problem4 {
	// 정적 배열
	static int[] fibo;

	// 1이나 2면 바로 return;
	public int solution(int n) {
		if (fibo[n] > 0) return fibo[n];

		if (n <= 1) return fibo[n] = 1;
		else if (n == 2) {
			fibo[n] = 1;
			return fibo[n - 1] = 1;
		}
		else return fibo[n] = solution(n - 2) + solution(n - 1);
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n + 1];

		// n번째 항
		T.solution(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}

	}
}
