package Chapter8;

import java.util.*;

/** 미로의 최단거리 통로
 * input1
 0 0 0 0 0 0 0
 0 1 1 1 1 1 0
 0 0 0 1 0 0 0
 1 1 0 1 0 1 1
 1 1 0 1 0 0 0
 1 0 0 0 1 0 0
 1 0 1 0 0 0 0
 * output1
 12
 */

class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Problem11 {

	static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	static int[][] board = new int[8][8], dis = new int[8][8];
	public void BFS(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		// 객체가 queue에 적재
		queue.offer(new Point(x, y));
		board[x][y] = 1;

		while(!queue.isEmpty()) {
			// 1,1 부터 퍼지기 시작한다.
			Point temp = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					queue.offer(new Point(nx, ny));
					dis[nx][ny] = dis[temp.x][temp.y] + 1;
				}
			}
		}

	}

	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		for (int i = 1; i <= 7; i++)
			for (int j = 1; j <= 7; j++)
				board[i][j] = kb.nextInt();

		T.BFS(1,1);
		if (dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);

	}
}
