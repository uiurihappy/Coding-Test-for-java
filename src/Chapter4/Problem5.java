package Chapter4;

import java.util.*;
/*
** K번째 큰 수
* input
10 3
13 15 34 23 45 65 33 11 26 42
* output
143
 */
class Problem5 {

	public int solution (int n, int k, int[] arr) {
		int answer = 0;
		// 기본 정렬은 오름차순
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

		if (n < k) answer = -1;

		// 슬라이딩 윈도우 (뻘짓)
//		for (int i = 0; i < 2; i++) sum += arr[i];
//		int key = 1;
//
//		for (int rt = 2; rt < n; rt++) {
//			sum += arr[rt];
//			set.add(sum);
//			sum -= arr[lt++];
//		}
//		System.out.println(set);

		// TreeSet 구조는 중복 할당 x = 중복 제거, 순서 보장 x
		// 이진탐색트리 구조라 정렬과 검색에 높은 성능을 보인다.
		/*
		TreeSet.remove(value) : 해당 value 삭제
		TreeSet.size() : Set 의 size return
		TreeSet.first() : 내림차순이면 최대값, 오름차순이면 최소값
		TreeSet.last() : 내림차순이면 최소값, 오름차순이면 최대값
		 */

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int l = j + 1; l < n; l++) {
					set.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;

		// reverseOrder로 저장된 set에 cnt++를 하여 k 번째 element를 찾는다.
		for (int x : set) {
			cnt++;
			if (cnt == k) {
				answer = x;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, k, arr));
	}
}
