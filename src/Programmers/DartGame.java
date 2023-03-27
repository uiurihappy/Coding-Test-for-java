package Programmers;

import java.util.*;

public class DartGame {

	public int solution(String dartResult) {
		// 기본기 solution
//		int answer = 0;
//		int idx = 0;
//		// 보너스, S: Single, D: Double, T: Triple
//		// 옵션, *: 스타상, #: 아차상
//		String num = "";
//		int[] dart = new int[3];
//
//		for (int i = 0; i < dartResult.length(); i++) {
//			char c = dartResult.charAt(i);
//
//			if (Character.isDigit(c)) {
//				num += String.valueOf(c);
//			} else if (c == 'S' || c == 'D' || c == 'T') {
//				int n = Integer.parseInt(num);
//				switch (c) {
//					case 'S':
//						dart[idx++] += (int) Math.pow(n, 1);
//						break;
//					case 'D':
//						dart[idx++] += (int) Math.pow(n, 2);
//						break;
//					case 'T':
//						dart[idx++] += (int) Math.pow(n, 3);
//						break;
//				}
//				num = "";
//			} else {
//				switch (c) {
//					case '*':
//						dart[idx - 1] *= 2;
//						if (idx - 2 >= 0) dart[idx - 2] *= 2;
//						break;
//					case '#':
//						dart[idx - 1] *= (-1);
//						break;
//				}
//			}
//		}
//
//		for (int x : dart)
//			answer += x;
//		return answer;

		// stack solution
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			if (Character.isDigit(c)) {
				sum = (c - '0');        // 초기값
				if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0'){
					sum = 10;
					i++;
				}
				stack.push(sum);
			} else {
				int prev = stack.pop();     // 1
				switch (c) {
					case 'S':
						prev = (int)Math.pow(prev, 1);
						break;
					case 'D':
						prev = (int)Math.pow(prev, 2);
						break;
					case 'T':
						prev = (int)Math.pow(prev, 3);
						break;
					case '*':
						if (!stack.isEmpty()){
							int value = stack.pop() * 2;
							stack.push(value);
						}
						prev *= 2;
						break;
					case '#':
						prev *= (-1);
						break;
				}
				stack.push(prev);
			}
		}
		while (!stack.isEmpty())
			answer += stack.pop();
		return answer;
	}

	public static void main(String[] args) {
		DartGame T = new DartGame();
		Scanner kb = new Scanner(System.in);
		String dartResult = kb.next();
		System.out.println(T.solution(dartResult));
	}
}
