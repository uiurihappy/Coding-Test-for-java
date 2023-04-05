package Programmers;

import java.util.Scanner;

/** 소수 만들기
 * input1
 4
 1 2 3 4
 * output1
 1
 * input2
 5
 1 2 7 6 4
 * output2
 4
 */
public class MakePrimeNumber {

	public boolean isPrime(int num) {
		// Math.sqrt: 제곱근 (ex. 루트 25 = 5 : Math.sqrt(25) = 5)
		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++){
				for (int k = j + 1; k < nums.length; k++){
					int num = nums[i] + nums[j] + nums[k];
					answer += isPrime(num) ? 1 : 0;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		MakePrimeNumber T = new MakePrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
			nums[i] = kb.nextInt();

		System.out.println(T.solution(nums));
	}
}
