package Chapter6;

import java.util.Scanner;

class Problem5 {

	public char solution (int n, int[] arr){
		char answer = 'U';

		// first sol
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) return 'D';
				else {
					continue;
				}
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, arr));

	}
}
