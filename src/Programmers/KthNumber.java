package Programmers;

import java.util.*;

/** k번째 수
 * input1
 7
 1 5 2 6 3 7 4
 3
 2 5 3
 4 4 1
 1 7 3
 * output1
 5 6 3
 */
public class KthNumber {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int j = 0; j < commands.length; j++) {
			int k = 0;
			int[] temp = new int[commands[j][1] - commands[j][0] + 1];

			for (int i = commands[j][0]; i <= commands[j][1]; i++)
				temp[k++] = (array[i - 1]);

			Arrays.sort(temp);
			answer[j] = temp[commands[j][2]- 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		KthNumber T = new KthNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = kb.nextInt();
		int c = kb.nextInt();
		int[][] commands = new int[c][3];
		for (int i = 0; i < c; i++)
			for (int j = 0; j < 3; j++)
				commands[i][j] = kb.nextInt();

		for (int x : T.solution(array, commands))
			System.out.print(x + " ");
	}
}
