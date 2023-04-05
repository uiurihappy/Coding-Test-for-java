package Programmers;

import java.util.Scanner;

/** 정수 제곱근 판별
 * input1
 121
 * output1
 144
 * input2
 3
 * output2
 -1
 */
public class IsSqrt {

	public long solution(long n) {
		long answer = 0;

		if (n % Math.sqrt(n) == 0)
			answer = (long) Math.sqrt(n) + 1;
		else
			return -1;
		return (long) Math.pow(answer, 2);
//		if (Math.pow((int) Math.sqrt(n), 2) == n) return (long) Math.pow(Math.sqrt(n) + 1, 2);
//		else return -1;
	}

	public static void main(String[] args) {
		IsSqrt T = new IsSqrt();
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		System.out.println(T.solution(n));
	}
}
