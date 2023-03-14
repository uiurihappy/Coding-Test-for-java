package Chapter8;

import java.util.*;

class Point14 {
	public int x, y;

	public Point14(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Problem14 {

	static int n, answer = 0;
	static int[][] board;
	static Queue<Point14> queue = new LinkedList<>();
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

	public void BFS(int x, int y, int[][] board) {
		queue.offer(new Point14(x, y));
		while(!queue.isEmpty()) {
			Point14 temp = queue.poll();

			for (int i = 0; i < 8; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					queue.offer(new Point14(nx, ny));
				}
			}

		}
	}

	public void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					// 일단 counting
					answer++;
					// 시작 지점 0으로 초기화
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}
	}

	public static void main(String[] args) {
		Problem14 T = new Problem14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				board[i][j] = kb.nextInt();

		T.solution(board);

		System.out.println(answer);

	}
}
