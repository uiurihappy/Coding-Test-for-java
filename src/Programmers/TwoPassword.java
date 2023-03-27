package Programmers;

import java.util.Scanner;

/** 둘만의 암호
 * input1
 aukks
 wbqd
 5
 * output1
 happy
 */
public class TwoPassword {

	public String solution(String s, String skip, int index) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int cnt = 1;
			while (cnt <= index) {
				++c;

				if (c > 'z')
					c -= 26;
				if (skip.contains(c + ""))
					continue;
				else cnt++;
			}
			answer += c;
		}

		return answer;
	}

	public static void main(String[] args) {
		TwoPassword T = new TwoPassword();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String skip = kb.next();
		int index = kb.nextInt();

		System.out.println(T.solution(s, skip, index));
	}
}
