package Programmers;

import java.util.Scanner;

public class DartGame {

	public int solution(String dartResult) {
		int answer = 0;
		int idx = 0;
		// 보너스, S: Single, D: Double, T: Triple
		// 옵션, *: 스타상, #: 아차상
		String num = "";
		int[] dart = new int[3];

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			if (Character.isDigit(c)) {
				num += String.valueOf(c);
			} else if (c == 'S' || c == 'D' || c == 'T') {
				int n = Integer.parseInt(num);
				switch (c) {
					case 'S':
						dart[idx++] += (int) Math.pow(n, 1);
						break;
					case 'D':
						dart[idx++] += (int) Math.pow(n, 2);
						break;
					case 'T':
						dart[idx++] += (int) Math.pow(n, 3);
						break;
				}
				num = "";
			} else {
				switch (c) {
					case '*':
						dart[idx - 1] *= 2;
						if (idx - 2 >= 0) dart[idx - 2] *= 2;
						break;
					case '#':
						dart[idx - 1] *= (-1);
						break;
				}
			}
		}

		for (int x : dart)
			answer += x;
		return answer;
	}

	public static void main(String[] args) {
		DartGame T = new DartGame();
		Scanner kb = new Scanner(System.in);
		String dartResult = kb.next();
		System.out.println(T.solution(dartResult));
	}
}
