package Programmers;

import java.util.*;

public class RemoveMinNumber {

	public int[] solution(int[] arr) {
		if (arr.length == 1) return new int[]{-1};
		int min = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(i -> i != min).toArray();
	}

	public static void main(String[] args) {
		RemoveMinNumber T = new RemoveMinNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		for (int x : T.solution(arr))
			System.out.print(x + " ");
	}
}
