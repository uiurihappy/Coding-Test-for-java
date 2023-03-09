package Chapter8;

import java.io.*;
import java.util.*;

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
