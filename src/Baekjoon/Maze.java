package Baekjoon;


import java.io.*;
import java.util.*;

/** 미로 탐색 (2178)
 * input1
4 6
101111
101010
101011
111011
 * output1
 15
 * input2
7 7
1011111
1110001
1000001
1000001
1000001
1000001
1111111
 * output2
 13
 */

class PointMaze {
	public int x, y;

	public PointMaze(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Maze {

	static int n, m;
	static int[][] board;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] visited;

	public void BFS(int x, int y) {
		Queue<PointMaze> queue = new LinkedList<>();
		// 객체가 queue에 적재
		queue.offer(new PointMaze(x, y));
		board[x][y] = 1;

		while(!queue.isEmpty()) {
			// 1,1 부터 퍼지기 시작한다.
			PointMaze temp = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 1 && nx <= x && ny >= 1 && ny <= y && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					queue.offer(new PointMaze(nx, ny));
					visited[nx][ny] = visited[temp.x][temp.y] + 1;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException{
		Maze T = new Maze();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[][] graph = new int[n][m];

		board = new int[n][m];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}
		visited = new int[n][m];
		visited[0][0] = 1;
		T.BFS(0, 0);
		System.out.println(visited[n-1][m-1]);

	}
}
