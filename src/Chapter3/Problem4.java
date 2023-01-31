package Chapter3;

import java.util.Scanner;
/*
** 연속 부분수열
* input
8 6
1 2 1 3 1 1 1 2

* output
3

 */
class Problem4 {

	// 시간 초과
//	public int solution (int n, int m, int[] arr) {
//		int answer = 0;
//      // O(n^2)
//		for (int i = 0; i < n; i++) {
//			int sum = 0;
//			for (int j = i; j < n; j++) {
//				sum += arr[j];
//				if (m == sum) {
//					answer++;
//					break;
//				}
//			}
//		}
//
//		return answer;
//	}
	// solution 2, Time: O(n)
	public int solution (int n, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;

		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			// lt를 빼고 lt를 증가시키면서 lt가 rt를 쫓아오도록
			while (sum >= m) {
				// 점점 lt를 이동시키면서 빼주고 m값에 맞춰준다.
				sum -= arr[lt++];
				if (sum == m) answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, m, arr));

	}
}
