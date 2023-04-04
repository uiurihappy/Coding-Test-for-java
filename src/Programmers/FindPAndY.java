package Programmers;

import java.util.Scanner;

/** 문자열 내 p와 y의 개수
 * input1
 pPoooyY
 * output1
 true
 * input2
 Pyy
 * output2
 false
 */
public class FindPAndY {

	boolean solution(String s) {
		s = s.toLowerCase();
//		int pCnt = 0, yCnt = 0;
//		for (char x : s.toCharArray()) {
//			if (x == 'p') pCnt++;
//			else if (x == 'y') yCnt++;
//		}
//		if (pCnt == yCnt)  return true;
//		else return false;
		return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
	}

	public static void main(String[] args) {
		FindPAndY T = new FindPAndY();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}
