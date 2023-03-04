package Chapter2;

import java.util.*;

/**
 * 뒤집은 소수
 * input
 9
 32 55 62 20 250 370 200 30 100
 * output
 23 2 73 2 3
 */
class Problem6 {

	public boolean isPrime(int num) {

		if (num < 2) return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) return false;
		}

		return true;
	}


	public ArrayList<Integer> solution (int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		// 숫자 뒤집기
		for (int j : arr) {
			int temp = j;
			int res = 0;
			// temp = 123
			while (temp > 0) {
				int t = temp % 10;		// 일의 자리
				res = res * 10 + t;		// 10배씩 증감
				temp = temp / 10;		// temp는 감소
			}
			if (isPrime(res)) answer.add(res);
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		for (int x : T.solution(arr))
			System.out.print(x + " ");

	}
}
