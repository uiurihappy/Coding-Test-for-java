package Programmers;

import java.util.*;
import java.util.stream.LongStream;

/** 크기가 작은 부분 문자열
 * input1
 3141592 271
 * output1
 2
 * input2
 500220839878 7
 * output2
 8
 * input3
 10203 15
 * output3
 3
 */
public class MinPartialString {

	public int solution(String t, String p) {
//		int answer = 0;
//		int partLen = p.length();
//		for (int i = 0; i < t.length() - partLen + 1; i++) {
//			long diff = Long.parseLong(t.substring(i, i + partLen));
//			if (diff <= Long.parseLong(p)) answer++;
//		}
//		return answer;
		long targetNumber = Long.parseLong(p);
		int targetNumberLength = p.length();

		return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
				.mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
				.mapToLong(Long::parseLong)
				.filter(number -> number <= targetNumber)
				.count();
	}

	public static void main(String[] args) {
		MinPartialString T = new MinPartialString();
		Scanner kb = new Scanner(System.in);
		String t = kb.next();
		String p = kb.next();
		System.out.println(T.solution(t, p));
	}
}
