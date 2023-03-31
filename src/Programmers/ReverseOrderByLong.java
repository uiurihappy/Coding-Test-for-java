package Programmers;

import java.util.*;

/** 정수 내림차순으로 배치하기
 * input1
118372
 * output1
873211
 */
public class ReverseOrderByLong {
	String res = "";
	public long solution(long n) {
		// sol 1
		res = "";
		Integer.toString((int) n).chars().sorted().forEach(c -> res = (char) c + res);
		return Integer.parseInt(res);
		// sol 2
//		String answer = "";
//
//		String str = Long.toString(n);
//		ArrayList<Character> temp = new ArrayList<>();
//
//		for (char x : str.toCharArray()){
//			temp.add(x);
//		}
//		temp.sort(Comparator.reverseOrder());
//		for (int i = 0; i < str.length(); i++)
//			answer += String.valueOf(temp.get(i));
//		return Long.parseLong(answer);
	}

	public static void main(String[] args) {
		ReverseOrderByLong T = new ReverseOrderByLong();
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		System.out.println(T.solution(n));
	}
}
