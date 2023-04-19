package Programmers;

import java.util.Scanner;

/** 콜라츠 추측
 * input1
 6
 * output1
 8
 * input2
 16
 * output2
 4
 * input3
 626331
 * output3
 -1
 */
public class Collatz {

	public int solution(int num) {
		long n = (long) num;
		for(int i = 0; i < 500; i++){
			if (n == 1) return i;
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Collatz T = new Collatz();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
