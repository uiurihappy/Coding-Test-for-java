package Chapter6;

import java.util.*;

/**
 * 선택 정렬 (Selection sort)
 * input
 6
 13 5 11 7 23 15

 * output
 5 7 11 13 15 23

 */
class Problem1 {

	public int[] solution(int n, int[] arr) {

		// selection sort, 일종의 swap 함수
		// 시간 복잡도는 O(n^2), 순서 보장이 안되어 불안정 정렬이다.
		for (int i = 0; i < n - 1; i++) {
			int min_index = i;
			for(int j = i + 1; j < n; j ++) {
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		Problem1 T = new Problem1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}
}
