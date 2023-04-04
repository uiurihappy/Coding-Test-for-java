package Programmers;

import java.util.Scanner;

/** 행렬의 덧셈
 * input1
2
1 2
2 3
2
3 4
5 6
 * output1
4 6
7 9
 * input2
 * output2
 *
 */
public class AddProcession {

	public int[][] solution(int[][] arr1, int[][] arr2) {
//		int[][] answer = new int[arr1.length][arr1[0].length];
		int[][] answer = arr1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] += arr2[i][j];
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		AddProcession T = new AddProcession();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int[][] arr1 = new int[a][2];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < 2; j++)
				arr1[i][j] = kb.nextInt();
		int b = kb.nextInt();
		int[][] arr2 = new int[b][2];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < 2; j++)
				arr2[i][j] = kb.nextInt();

		for (int[] x : T.solution(arr1, arr2)) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}
