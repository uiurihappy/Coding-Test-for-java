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
		int lt = 0, rt = n - 1;
		Arrays.sort(arr);

		// 이분 검색, 점점 rt, lt 범위를 좁혀나간다.
		while(lt <= rt) {
			int mid = (lt + rt) / 2;

			if (arr[mid] == m) {
				return mid + 1;
			}
			if (arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
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
