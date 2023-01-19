package String;

import java.util.Scanner;

class Problem9 {

	public int solution(String str) {
		StringBuilder answer = new StringBuilder();
		char[] arr = str.toCharArray();

		for(char x : arr) {
			if((int)x <= 57 && (int)x >= 48) {
				answer.append(x);
			}
		}

		return Integer.parseInt(String.valueOf(answer));
	}

	public static void main(String[] args) {
		Problem9 T = new Problem9();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
