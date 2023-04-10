package Programmers;

import java.util.Scanner;

/** 덧칠하기
 * input1
 8 4 3
 2 3 6
 * output1
 2
 * input2
 5 4 2
 1 3
 * output2
 1
 * input3
 4 1 4
 1 2 3 4
 * output3
 4
 */

public class Painting {

	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int maxPainted = Integer.MIN_VALUE;
		for (int point : section) {
			if (maxPainted <= point) {
				maxPainted = point + m;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Painting T = new Painting();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int s = kb.nextInt();
		int[] section = new int[s];
		for (int i = 0; i < s; i++)
			section[i] = kb.nextInt();
		System.out.println(T.solution(n, m, section));
	}
}
