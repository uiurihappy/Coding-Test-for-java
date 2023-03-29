package Programmers;

import java.util.Scanner;

public class PushKeyPad {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		return answer;
	}
	public static void main(String[] args) {
		PushKeyPad T = new PushKeyPad();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] numbers = new int[n];
		String hand = kb.next();
		System.out.println(T.solution(numbers, hand));
	}
}
