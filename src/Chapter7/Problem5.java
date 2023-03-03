package Chapter7;

import java.util.*;

/** 부분집합 구하기 (DFS)
 * input
 3
 * output
 1 2 3
 1 2
 1 3
 1
 2 3
 2
 3
 */
public class Problem5 {
	static int[] ch;
	static int n;
	public void solution(int L) {
		if (L == (n + 1)) {

		} else {

		}
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n + 1];
		T.solution(n);
	}
}
