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
 5
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

	public int solution(int[][] board) {
		SafetyZone T = new SafetyZone();
		int[][] boomBoard = new int[n][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					T.Explosion(i, j, boomBoard);
				}
			}
		}

		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++) {
				if (boomBoard[i][j] <= 0) answer++;
				System.out.print(boomBoard[i][j] + " ");
			}
			System.out.println();
		}
		return answer;
	}
	public void Explosion(int x, int y, int[][] boomBoard) {
		int[] dx = {0, -1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {0, -1, 0, 1, -1, 1, -1, 0, 1};
		for (int i = 0; i < 9; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n){
				boomBoard[nx][ny] = 1;
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

		System.out.println(T.solution(board));

	}
}
