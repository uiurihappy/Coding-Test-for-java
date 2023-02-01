package Chapter4;

import java.util.*;

/*
** 매출액
* input
7 4
20 12 20 10 23 17 10
* output
3 4 4 3
 */

class Problem3 {

	public ArrayList<Integer> solution (int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		int lt = 0;

		// k - 1 기준으로 쪼개서 탐색한다.
		for (int i = 0; i < k - 1; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		for (int rt = k - 1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
//			System.out.println(map);
			map.put(arr[lt], map.get(arr[lt]) - 1);
//			System.out.println(map);
			if (map.get(arr[lt]) == 0)
				map.remove(arr[lt]);
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
