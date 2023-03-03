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
			String tmp = "";

			for(int i = 1; i <= n; i++) {
				if (ch[i] == 1) tmp += (i + " ");
			}
			// 공집합 예외 처리
			if (tmp.length() > 0) System.out.println(tmp);
		} else {
			ch[L] = 1; 	// 사용한다.
			// 왼쪽
			solution(L+1);

			ch[L] = 0; 	// 사용하지 않는다.
			// 오른쪽
			solution(L+1);

		}
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n + 1];
		T.solution(1);
	}
}
