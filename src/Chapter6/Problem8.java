package Chapter6;

import java.util.*;

/**
 * 이분 검색 (이진 탐색), 시간 복잡도 O(logN)
 * input
8 32
23 87 65 12 57 32 99 81
 * output
3
 */
class Problem8 {

	public int solution(int n, int m, int[] arr) {
		int left = 0, right = n - 1;
//		Arrays.sort(arr);
		int mid;
		// 이분 검색, 점점 rt, lt 범위를 좁혀나간다.
		while (left <= right) {
			mid = (right + left) / 2;

			// 원하는 값을 찾았다면 그 위치를 반환.
			if (arr[mid] == m) {
				return mid;
			}

			if (m < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Problem8 T = new Problem8();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		System.out.println(T.solution(n, m, arr));
	}

}
