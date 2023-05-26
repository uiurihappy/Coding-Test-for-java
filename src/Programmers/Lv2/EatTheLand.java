package Programmers.Lv2;

import java.util.Scanner;

/** 땅따먹기=
 * input1
 3
 1 2 3 5
 5 6 7 8
 4 3 2 1
 * output1
 */
public class EatTheLand {

	public int solution(int[][] land) {
		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
			land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
			land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
			land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
		}

		for (int i = 0; i < 4; i++) {
			answer = Math.max(answer, land[land.length - 1][i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		EatTheLand T = new EatTheLand();
		Scanner kb = new Scanner(System.in);
		// 3
		int n = kb.nextInt();
		// 4
		int[][] land = new int[n][4];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 4; j++)
				land[i][j] = kb.nextInt();

		System.out.println(T.solution(land));
	}
}
