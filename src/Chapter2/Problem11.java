package Chapter2;

import java.util.Scanner;

class Problem11 {

	public int solution(int n, int[][] arr) {
		int answer = 0, min = Integer.MIN_VALUE;

		// i번 학생
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			// j학년
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= 5; k++) {
					// 1번 2번 학생, 1번 3번... 학생 순으로 루프를 돈다.
//					System.out.print(arr[i][k] + " "+ arr[j][k] + " ");
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
//				System.out.println();
			}
			if (cnt > min) {
//				System.out.println("cnt = " + cnt);
				min = cnt;
				answer = i;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n + 1][6];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
