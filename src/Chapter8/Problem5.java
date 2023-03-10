package Chapter8;

import java.io.*;
import java.util.*;

/** 동전 교환
 * 거슬러 줄 동전의 최소 갯수
 * 5 + 5 + 5 = 15 총 3개가 가장 최소 갯수
 * input1
 3
 1 2 5
 15
 * output1
 3
 */
public class Problem5 {

	static int n;
	static int[] arr;
	static int fee;
	static int answer = Integer.MAX_VALUE;
//	static String str;

	public void DFS(int L, int sum) {
		if (sum > fee) return;
		if (L >= answer) return;

		if (sum == fee){
			answer = Math.min(L, answer);
		} else {
			for (int i = 0; i < n; i++)
				DFS(L + 1, sum + arr[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];

//		st = new StringTokenizer(br.readLine());
//		str = st.nextToken();
//		System.out.println(str);

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		fee = kb.nextInt();

		T.DFS(0, 0);
		System.out.println(answer);
	}
}
