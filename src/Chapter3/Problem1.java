package Chapter3;

import java.util.*;

class Problem1 {

	// solution 1, Time: 180ms
//	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		for (int x : arr1) answer.add(x);
//		for (int x : arr2) answer.add(x);
//		Collections.sort(answer);
//
//		return answer;
//	}

	// solution 2, Time: 170ms
	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;

		while (p1 < n && p2 < m) {
			if (arr1[p1] < arr2[p2])
				answer.add(arr1[p1++]);
			else
				answer.add(arr2[p2++]);
		}
		while (p1 < n) answer.add(arr1[p1++]);
		while (p2 < m) answer.add(arr2[p2++]);

		return answer;
	}
	public static void main(String[] args) {
		Problem1 T = new Problem1();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}

		int m = kb.nextInt();
		int[] arr2 = new int[m];

		for (int i = 0; i < m; i++) {
			arr2[i] = kb.nextInt();
		}

		for (int x : T.solution(n, arr1, m, arr2)) {
			System.out.print(x + " ");
		}
	}
}
