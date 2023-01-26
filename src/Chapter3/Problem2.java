package Chapter3;

import java.util.*;

class Problem2 {
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		// 정렬부터
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// n = 5, m = 4라 가정
		int p1 = 0, p2 = 0;

		// 시간 복잡도는 O(n) 일듯..?
		// 원래 사용하려 했던 이중 for문은 데이터 양이 적으면 터지지 않겠지만
		// 20000, 30000개씩 들어오면 O(n^2)이라 터짐
		while (p1 < n && p2 < m) {
			if (arr1[p1] == arr2[p2]) {
				// 같은 경우 삽입
				answer.add(arr1[p1++]);
				p2++;
			}
			// 정렬 되어서 낮은 값이 있으면 index 를 올린다.
			else if (arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem2 T = new Problem2();
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

		for (int x : T.solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
}
