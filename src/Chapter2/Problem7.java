package Chapter2;

import java.util.Scanner;

/** 점수 계산
 input:
 10
 1 0 1 1 1 0 0 1 1 0
 output: 10
 */
class Problem7 {

	public int solution (int[] arr) {
		int answer = 0;
		int cnt = 0;
		for (int j : arr) {
			if (j == 1) {
				cnt++;
				answer += cnt;
			} else cnt = 0;
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem7 T = new Problem7();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(arr));
	}
}
