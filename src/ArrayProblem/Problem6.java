package ArrayProblem;

import java.util.*;

class Problem6 {

	// 소수 체크
	public boolean isPrime(int num) {
		if (num == 1) return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) // 소수가 아니다.
				return false;
		}

		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int res = 0;
			int temp = arr[i];
			// ex) temp = 123
			while (temp > 0) {
				// t = 123 % 10 = 3
				int t = temp % 10;
				// res = 0 + 3 = 3
				res = res * 10 + t;
				// temp = 123 / 10 = 12, 12 / 10 = 1
				temp = temp / 10;
			}

			if (isPrime(res)) {
				answer.add(res);
			}
		}


		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}
}
