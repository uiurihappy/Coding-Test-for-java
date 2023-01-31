package Chapter3;

import java.util.*;

/*
** 공통원소 구하기
* input
5
1 3 9 5 2
5
3 2 5 7 8

* output
2 3 5

 */

class Problem2 {
	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();

		// 정렬부터
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// n = 5, m = 4라 가정
		int i = 0, j = 0;
		// 시간 복잡도는 O(n) 일듯..?
		// 원래 사용하려 했던 이중 for문은 데이터 양이 적으면 터지지 않겠지만
		// 20000, 30000개씩 들어오면 O(n^2)이라 터짐
		while(i < n&& j < m) {
			if (arr1[i] > arr2[j]){
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				answer.add(arr1[i]);
				i++;
				j++;
			}
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
