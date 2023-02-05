package Chapter5;

import java.util.Scanner;
import java.util.Stack;

/**
** 크레인 인형뽑기 (카카오)
* input
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
* output
4
 */
class Problem3 {

	public int solution (int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[j][moves[i] - 1] != 0) {
					int temp = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
//					System.out.println(stack);
					if (!stack.isEmpty() && temp == stack.peek()) {
						stack.pop();
						answer += 2;
					}
					else stack.push(temp);
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}

		int m = kb.nextInt();
		int[] moves = new int[m];

		for (int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}


		System.out.println(T.solution(n, board, m, moves));
	}
}
