package Programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindRemain1 {

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
//		return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
		return answer;
	}

	public static void main(String[] args) {
		FindRemain1 T = new FindRemain1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
