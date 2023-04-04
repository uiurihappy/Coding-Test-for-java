package Programmers;

import java.util.Scanner;

/** 자릿수 더하기
 * input1
 * 123
 * output1
 * 6
 * input2
 * 987
 * output2
 * 24
 */
public class SumByPosition {

	public int solution(int n) {
		int answer = 0;
		for(String s : String.valueOf(n).split(""))
			answer += Integer.parseInt(s);
//		while (n != 0) {
//			answer += n % 10;
//			n /= 10;
//		}
		return answer;
	}

	public static void main(String[] args) {
		SumByPosition T = new SumByPosition();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
