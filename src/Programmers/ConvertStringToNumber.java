package Programmers;

import java.util.Scanner;

/** 문자열을 정수로 바꾸기
 * input1
 1234
 * output1
 1234
 * input2
 -1234
 * output2
 -1234
 */
public class ConvertStringToNumber {

	public int solution(String s) {
//		int answer =
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		ConvertStringToNumber T = new ConvertStringToNumber();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}
