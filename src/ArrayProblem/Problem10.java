package ArrayProblem;

import java.util.Scanner;

class Problem10 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};

//  // solution 1
//	public int solution(int n, int[][] arr) {
//		int answer = 0;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				// 가장자리 제외
//				if (i == 0 || j == 0 || i == n -1 || j == n - 1) continue;
//				// 상하좌우 비교
//				else {
//					// 상
//					if(arr[i][j] > arr[i + 1][j]
//					// 하
//					&& arr[i][j] > arr[i - 1][j]
//					// 좌
//					&& arr[i][j] > arr[i][j - 1]
//					// 우
//					&& arr[i][j] > arr[i][j + 1])
//						answer++;
//				}
//			}
//		}
//
//		return answer;
//	}

	public int solution(int n, int[][] arr) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 봉우리인지 아닌지 판별
				boolean flag = true;
				// 네 방향만큼 루프
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];

					// 봉우리가 아니다.
					if(nx >= 0 && nx < n && ny >= 0 && ny < n
					&& arr[nx][ny] >= arr[i][j]) {
						flag = false;
						// 판별했으니 굳이 루프를 돌 필요가 없다.
						break;
					}
				}
				if (flag) answer++;
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
