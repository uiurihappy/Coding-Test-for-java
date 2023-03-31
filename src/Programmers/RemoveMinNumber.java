package Programmers;

import java.util.*;

/** 가장 작은 수 제거하기
 * input1
 4
 4 3 2 1
 * output1
 4 3 2
 * input2
 10
 * output2
 -1
 */
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
