package Programmers;

import java.util.*;

/** 숫자 변환하기
 * input1
 10 40 5
 * output1
 2
 * input2
 10 40 30
 * output2
 1
 * input3
 2 5 4
 * output3
 -1\
 */
public class PlusNumber {

	public int solution(int x, int y, int n) {
		int answer = 0;
		if (x == y) return 0;
		/* 연산 방법
		1. x + n
		2. x * 2
		3. x * 3
		 */
		int[] arr = new int[10000001];
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);

		while (!q.isEmpty()) {
			int num = q.poll();
			// 연산 방법 가지 수 배열
			int[] sol = new int[3];
			sol[0] = num + n;
			sol[1] = num * 2;
			sol[2] = num * 3;

			for (int i = 0; i < 3; i++) {
				int next = sol[i];
				if (next > y)
					continue;
				if (arr[next] == 0 || arr[next] > arr[num] + 1) {
					arr[next] = arr[num] + 1;
					q.offer(next);
				}
			}

		}
		return arr[y] != 0 ? arr[y] : -1;
	}

	public static void main(String[] args) {
		PlusNumber T = new PlusNumber();
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		int n = kb.nextInt();
		System.out.println(T.solution(x, y, n));
	}
}
