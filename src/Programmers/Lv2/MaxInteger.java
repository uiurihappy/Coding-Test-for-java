package Programmers.Lv2;

import java.util.*;

public class MaxInteger {

	private String solution(int[] numbers) {
		String[] arr = new String[numbers.length];

		for (int i = 0; i < arr.length; i++)
			arr[i] = String.valueOf(numbers[i]);

		Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if (arr[0].equals("0"))
			return "0";

		StringBuilder answer = new StringBuilder();

		for (String s : arr)
			answer.append(s);

		return answer.toString();
	}

	public static void main(String[] args) {
		MaxInteger T = new MaxInteger();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++)
			numbers[i] = kb.nextInt();
		System.out.println(T.solution(numbers));
	}
}
