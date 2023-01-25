package ArrayProblem;

import java.util.Scanner;

class Problem7 {

	public int solution (int[] arr) {
		int answer = 0;
		int temp = 0;
		for (int j : arr) {
			if (j == 1) {
				temp++;
				answer += temp;
			} else {
				temp = 0;
			}
		}


		return answer;
	}

	public static void main(String[] args) {
		Problem7 T = new Problem7();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(arr));
	}
}
