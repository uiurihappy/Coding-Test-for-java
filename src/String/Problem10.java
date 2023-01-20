package String;

import java.util.ArrayList;
import java.util.Scanner;

class Problem10 {

	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];


		return answer;
	}

	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		char t = kb.next().charAt(0);
		for(int x : T.solution(str, t)) {
			System.out.println(x + " ");
		}
	}
}
