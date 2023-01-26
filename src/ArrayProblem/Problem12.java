package ArrayProblem;

import java.util.Scanner;

class Problem12 {

	// n = 열, m = 행
	public int solution(int col, int row, int[][] arr) {
		int answer = 0;

		// 멘토 랭킹 1 ~ 4등 루프
		for (int i = 1; i <= col; i++) {
			// 멘티 랭킹 1 ~ 4등 루프
			for (int j = 1; j <= col; j++) {
				// 같을 때 방지
				if(i == j) continue;

				// init
				int cnt = 0;
				int mentor = 0, mentee = 0;

				// 0 ~ 2 행
				for (int k = 0; k < row; k++) {
					// 0 ~ 3 열
					for(int s = 0; s < col; s++) {
//						System.out.println("mentor: " + arr[k][s] + " " + i + " " + s);
						if (arr[k][s] == i) mentor = s;

//						System.out.println("mentee: " + arr[k][s] + " " + j + " " + s);
						if (arr[k][s] == j) mentee = s;
					}
//					System.out.println();

					if (mentor < mentee) {
//						System.out.println("mentor: " + mentor + ", mentee: " + mentee);
						cnt++;
					}
				}

				if (cnt == row) {
					answer++;
				}
//				System.out.print(arr[i][j] + " ");
			}
//			System.out.println();
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner kb = new Scanner(System.in);

		int col = kb.nextInt(); // 열
		int row = kb.nextInt(); // 행
		int[][] arr = new int[row][col];


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.println(T.solution(col, row, arr));
	}
}
