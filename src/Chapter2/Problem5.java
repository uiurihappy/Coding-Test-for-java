package Chapter2;

import java.util.Scanner;

/** 에라토스테네스 체 방법: 체크로 걸러서 소수 갯수를 구한다.
 * input: 20
 * output: 8
 */

class Problem5 {

	public int solution(int n) {
		int answer = 0;
		// 동적 배열은 다 0으로 초기화
		int[] arr = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (arr[i] < 1) {
				answer++;
				for (int j = i; j <= n; j = j + i) {
					// 소수가 아니라고 판단하여 1로 할당
					arr[j] = 1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
