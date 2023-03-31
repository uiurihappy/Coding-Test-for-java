package Programmers;

import java.util.Scanner;

/** 소수 찾기
 * input1
 10
 * output1
 4
 * input2
 5
 * output2
 3
 */
public class FindPrimeNumber {

	public int solution(int n) {
		// 에라토스테네스 체 기법으로 푼다.
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
		FindPrimeNumber T = new FindPrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
