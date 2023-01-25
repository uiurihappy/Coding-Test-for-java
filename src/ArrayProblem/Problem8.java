package ArrayProblem;

/*
	등수 구하기
	input: 5
		87 89 92 100 76
	output: 4 3 2 1 5
 */

import java.util.ArrayList;
import java.util.Scanner;

class Problem8 {

	public ArrayList<Integer> solution (int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int ranking = 1;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					ranking++;
				}
			}
			answer.add(ranking);
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem8 T = new Problem8();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : T.solution(arr)) {
			System.out.print(x + " ");
		}
	}
}
