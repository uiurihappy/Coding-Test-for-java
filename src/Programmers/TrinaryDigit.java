package Programmers;

import java.util.*;

/** 3진법 뒤집기
 * input1
 45
 * output1
 7
 * input2
 125
 * output2
 229
 */
public class TrinaryDigit {

	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 0) {
			list.add(n % 3);
			n /= 3;
		}
		int tmp = 1;
		// 뒤집기
		for (int i = list.size() - 1; i >= 0; i--) {
			answer += list.get(i) * tmp;    // 뒤집은 것을 곱
			tmp *= 3;
		}
		return answer;
	}

	public static void main(String[] args) {
		TrinaryDigit T = new TrinaryDigit();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
