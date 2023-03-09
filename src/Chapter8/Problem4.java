package Chapter8;

import java.io.*;
import java.util.*;

/** 중복 순열
 * 1부터 n번의 공들이 있는데 m만큼 꺼낸 공의 조합 출력
 * 단, 오름차순
 * input1
 n m
 3 2
 * output2
 1 1
 1 2
 1 3
 2 1
 2 2
 2 3
 3 1
 3 2
 3 3
 */
public class Problem4 {

	static int n, m;
	static int[] pm;

	public void DFS(int L) {
		if (L == m) {
			for (int x : pm)
				System.out.print(x + " ");
			System.out.println();
		} else {
			for (int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Problem4 T = new Problem4();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		pm = new int[m];

		T.DFS(0);
	}
}
