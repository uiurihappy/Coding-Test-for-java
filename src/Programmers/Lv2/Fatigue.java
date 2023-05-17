package Programmers.Lv2;

import java.util.Scanner;

/** 피로도
 * input1
 80
 3 2
 80 20 50 40 30 10
 * output1
 3
 */
public class Fatigue {

	static int answer;
	static boolean[] visited;

	public int solution(int k, int[][] dungeons) {
		answer= 0;
		visited= new boolean[dungeons.length];

		dfs(k, dungeons, 0, 0);

		return answer;
	}

	public void dfs(int k, int[][] dungeons, int idx, int cnt){
		if(idx==dungeons.length){
			answer= answer>cnt ? answer:cnt;
			return;
		}

		for(int i=0; i<dungeons.length; i++){
			if(dungeons[i][0]>k||visited[i]) continue;
			visited[i]= true;
			dfs(k-dungeons[i][1], dungeons, idx+1, cnt+1);
			visited[i]= false;
		}
		dfs(k, dungeons, idx+1, cnt);
	}

	public static void main(String[] args) {
		Fatigue T = new Fatigue();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int m = kb.nextInt();

		int[][] dungeons = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dungeons[i][j] = kb.nextInt();
			}
		}

		System.out.println(T.solution(k, dungeons));
	}
}
