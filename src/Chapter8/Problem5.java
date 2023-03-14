package Chapter8;

import java.io.*;
import java.util.*;

/** 동전 교환 (냅색 알고리즘)
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


//	static String str;

	// 시간 복잡도 초과
//	public void DFS(int L, int sum) {
//		if (sum > fee) return;
//		if (L >= answer) return;
//
//		if (sum == fee){
//			answer = Math.min(L, answer);
//		} else {
//			for (int i = 0; i < n; i++)
//				DFS(L + 1, sum + arr[i]);
//		}
//	}
	static int n, fee;
	static int[] arr, dy;

	public int knapsack() {
		for (int coin : arr) {
			for (int j = coin; j <= fee; j++) {
				int tmp = dy[j - coin] + 1;
				if (dy[j] > tmp) dy[j] = tmp;
			}
		}
		return dy[fee];
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];

//		st = new StringTokenizer(br.readLine());
//		str = st.nextToken();
//		System.out.println(str);

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		fee = kb.nextInt();
		dy = new int[fee + 1];
		for (int i = 1; i < dy.length; i++) {
			dy[i] = Integer.MAX_VALUE;
		}


		System.out.println(T.knapsack());
	}
}
