package Chapter7;

import java.util.Scanner;

/**
 * 이진수 구하기
 * input
 11
 * output
 1011
  */

class Problem2 {

	public void solution(int n) {
		if (n == 0) return;
		else {
			solution(n / 2);
			System.out.print(n % 2);
		}
	}
	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}
}
