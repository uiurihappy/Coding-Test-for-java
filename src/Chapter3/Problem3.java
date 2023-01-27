package Chapter3;

import java.util.Scanner;

class Problem3 {

	public int solution (int n, int d, int[] arr) {
		int sum = 0;

		for (int i = 0; i < d; i++) {
			// 첫 매출
			sum += arr[i];
		}
		int answer = sum;

		for (int i = d; i < n; i++) {
			sum += (arr[i] - arr[i - d]);
			answer = Math.max(answer, sum);
		}

		return answer;
	}
	public static void main(String[] args) {
		Problem3 T = new Problem3();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int d = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, d, arr));
	}
}
