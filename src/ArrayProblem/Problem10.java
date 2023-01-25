package ArrayProblem;

import java.util.Scanner;

class Problem10 {

	public int solution(int n, int[][] arr) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 가장자리 제외
				if (i == 0 || j == 0 || i == n -1 || j == n - 1) continue;
				// 상하좌우 비교
				else {
					if(arr[i][j] > arr[i - 1][j]
					&& arr[i][j] > arr[i + 1][j]
					&& arr[i][j] > arr[i][j + 1]
					&& arr[i][j] > arr[i][j - 1])
						answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt() + 2;
		int[][] arr = new int[n][n];

		// init
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i != 0 && j != 0 && i != n - 1 && j != n - 1) { // 가장자리를 제외하고 입력 값으로 초기화합니다.
					arr[i][j] = kb.nextInt();
				}
			}
		}

		System.out.println(T.solution(n, arr));
	}
}
