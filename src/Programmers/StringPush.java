package Programmers;

import java.util.Scanner;

/** 문자열 밀기
 * input1
 hello lohel
 * output1
 1
 * input2 (몇번을 밀어도 안됨)
 apple elppa
 * output2
 -1
 * input3
 abc abc
 * output3
 0
 */
public class StringPush {

	public int solution(String A, String B) {
		// solution 1
//		int answer = 0;
//		String temp = A;
//		for (char x : A.toCharArray()) {
//			if (temp.equals(B))
//				return answer;
//			String a = temp.substring(temp.length() - 1);
//			System.out.println("a = " + a);
//			temp = a + temp.substring(0, temp.length() - 1);
//			answer++;
//		}
//
//		return -1;
		// solution 2
//		return (B+B).indexOf(A);
		// solution 3
		String temp = B.repeat(3);
		return temp.indexOf(A);
	}

	public static void main(String[] args) {
		StringPush T = new StringPush();
		Scanner kb = new Scanner(System.in);

		String A = kb.next();
		String B = kb.next();

		System.out.println(T.solution(A, B));
	}
}
