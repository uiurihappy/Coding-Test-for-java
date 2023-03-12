package Chapter8;

import java.io.*;
import java.util.StringTokenizer;

/** 최대점수 구하기
 * input1
5 20
10 5
25 12
15 8
6 3
7 4
 * output1
41
 */
public class Problem3 {

	static int n;
	static int m;
	static int[] ps;
	static int[] pt;
	static int answer = Integer.MIN_VALUE;

	public void DFS(int L, int sum, int time, int[]ps, int[] pt) {
		if (time > m) return;
		if (L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
			DFS(L + 1, sum, time, ps, pt);
		}
	}

	public static void main(String[] args) throws IOException {
		Problem3 T = new Problem3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		ps = new int[n];
		pt = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			ps[i] = Integer.parseInt(st.nextToken());
			pt[i] = Integer.parseInt(st.nextToken());
		}

		T.DFS(0, 0, 0, ps, pt);
		System.out.println(answer);
	}
}
