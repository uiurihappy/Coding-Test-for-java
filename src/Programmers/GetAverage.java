package Programmers;

import java.util.*;

public class GetAverage {

	public double solution(int[] arr) {

//		for (int num : arr)
//			answer += num;
//		answer = answer / arr.length;
		return Arrays.stream(arr).average().orElse(0);
	}

	public static void main(String[] args) {
		GetAverage T = new GetAverage();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		System.out.println(T.solution(arr));
	}
}
