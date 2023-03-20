package Baekjoon;

import java.io.*;
import java.util.*;

public class Maze {

	static int n, m;
	static int[][] board;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public int bfs(int[][] graph, int n, int m) {
		List<int []> queue = new ArrayList<>();

		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) throws IOException{
		Maze T = new Maze();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[][] graph = new int[n][m];

		board = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				board[i][j] = s.charAt(j) - '0';
			}
		}


		System.out.println(T.bfs(graph, n, m));

	}
}
