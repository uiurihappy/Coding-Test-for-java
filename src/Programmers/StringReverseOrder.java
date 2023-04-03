package Programmers;

import java.util.*;

/** 문자열 내림차순으로 배치하기
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * input1
 Zbcdefg
 * output1
 gfedcbZ
 */
public class StringReverseOrder {

	public String solution(String s) {
		char[] sol = s.toCharArray();
		Arrays.sort(sol);
		// sol을 string으로 StringBuilder로 변환 후에 reverse, toString 사용
		return new StringBuilder(new String(sol)).reverse().toString();
	}
	public static void main(String[] args) {
		StringReverseOrder T = new StringReverseOrder();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}
