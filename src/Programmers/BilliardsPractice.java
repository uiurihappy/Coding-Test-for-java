package Programmers;

import java.util.Scanner;

public class BilliardsPractice {
	public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
		int[] answer = {};
		return answer;
	}


	public static void main(String[] args) {
		BilliardsPractice T = new BilliardsPractice();
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		int n = kb.nextInt();
		int startX = kb.nextInt();
		int startY = kb.nextInt();
		int k = kb.nextInt();
		int[][] balls = new int[k][2];
		for (int i = 0; i < k; i++)
			for (int j = 0; j < 2; j++)
				balls[i][j] = kb.nextInt();

		for (int x : T.solution(m, n, startX, startY, balls))
			System.out.println(x + " ");

	}
}
