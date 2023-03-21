package Programmers;

import java.util.Scanner;

/** 치킨 쿠폰
 * input1
 * 100
 * output
 * 11
 * input2
 * 1081
 * output2
 * 120
 */
public class ChickenCoupon {

	public int solution(int chicken) {

		// if 1081
		int coupon = chicken;  // 108
		int	answer = 0;

		while (coupon >= 10) {
			int remain = coupon % 10;
			answer += coupon / 10;  // 118
			coupon = remain + coupon / 10;           // 10
		}

		return answer;
	}
	public static void main(String[] args) {
		ChickenCoupon T = new ChickenCoupon();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
