package Chapter6;

import java.util.Scanner;

/**
 * 버블 정렬 (Bubble sort)
 * input
 6
 13 5 11 7 23 15

 * output
 5 7 11 13 15 23

 */

class Problem2 {

	// 시간 복잡도 O(n^2), 안정 정렬
	public int[] solution (int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		for (int x : T.solution(n, arr))
			System.out.print(x + " ");

	}
}
