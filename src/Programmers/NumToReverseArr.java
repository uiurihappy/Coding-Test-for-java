package Programmers;

import java.util.*;

public class NumToReverseArr {
	public int[] solution(long n) {
		String[] num = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
		return Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
//		return new StringBuilder().append(n)    // stringBuilder 초기화 후 append
//		    .reverse()                          // reverse
//		    .chars()
//		    .map(Character::getNumericValue)    // 순회를 돌면서 char to int
//		    .toArray();                         // 배열로 return
	}

	public static void main(String[] args) {
		NumToReverseArr T = new NumToReverseArr();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for (int x : T.solution(n))
			System.out.print(x + " ");
	}
}
