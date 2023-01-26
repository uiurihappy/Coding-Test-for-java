package ArrayProblem;

/*
	격자판 최대합
	input:
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

	output: 155
 */

import java.util.Scanner;

class Problem9 {

	public int solution (int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;

		// 행과 열의 최대값
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];  // 행 합
				sum2 += arr[j][i];  // 열 합
			}
			answer = Math.max(answer, sum2);
			answer = Math.max(answer, sum1);
		}
		sum1 = sum2 = 0;

		// 대각선 합
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}
		answer = Math.max(answer, sum2);
		answer = Math.max(answer, sum1);

		return answer;
	}

	public static void main(String[] args) {
		Problem9 T = new Problem9();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++){
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(T.solution(n, arr));
	}
}
