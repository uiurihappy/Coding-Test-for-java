package Programmers;

import java.util.Scanner;

/** 문자열 나누기
 * input1
 banana
 * output1
 3
 * input2
 abracadabra
 * output2
 6
 * input3
 aaabbaccccabba
 * output3
 3
 */
public class StringSplit {

	public int solution(String s) {
		int answer = 0;
		char first = s.charAt(0);
		int diff = 0;           // 다른 횟수
		int firstNum = 0;       // 첫 글자와 같은 횟수
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				answer++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
		}
		return answer;
	}

	public static void main(String[] args) {
		StringSplit T = new StringSplit();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}
