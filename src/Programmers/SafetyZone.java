package Programmers;

import java.util.Scanner;

/** 안전지대
 * input1
 5
 0 0 0 0 0
 0 0 0 0 0
 0 0 0 0 0
 0 0 1 0 0
 0 0 0 0 0
 * output1
 16
 * input2
 0 0 0 0 0
 0 0 0 0 0
 0 0 0 0 0
 0 0 1 1 0
 0 0 0 0 0
 * output2
 13
 */

public class SafetyZone {

	static int n, answer = 0;
	static int[][] board;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

	public void DFS(int x, int y, int[][] board) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
				board[nx][ny] += 1;
				DFS(nx, ny, board);
			}
		}
	}

	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					DFS(i, j, board);
				}
			}
		}

	}

	public static void main(String[] args) {
		SafetyZone T = new SafetyZone();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				board[i][j] = kb.nextInt();

		T.solution(board);
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++) {
				if (board[i][j] <= 0) answer++;
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(answer);
	}
}
