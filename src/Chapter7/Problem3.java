package Chapter7;

import java.util.Scanner;

/**
 * 팩토리얼
 * input
 5
 * output
 120
 */
class Problem3 {

	public int solution(int n) {
		if (n == 1) return 1;
		else {
//			System.out.println(solution(n - 1));
			return n * solution(n - 1);
		}
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
