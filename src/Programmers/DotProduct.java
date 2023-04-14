package Programmers;

import java.util.*;
import java.util.stream.*;

/** 내적
 * input1
 4
 1 2 3 4
 -3 -1 0 2
 * output1
 3
 * input2
 3
 -1 0 1
 1 0 -1
 * output2
 -2
 */
public class DotProduct {
	public int solution(int[] a, int[] b) {
		return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
	}

	public static void main(String[] args) {
		DotProduct T = new DotProduct();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = kb.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = kb.nextInt();
		System.out.println(T.solution(a, b));
	}

}
