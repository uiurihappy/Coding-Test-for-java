package Programmers.Lv2;

import java.util.*;

/** 프로세스
 * input1
 4
 2 1 3 2
 2
 * output1
 1
 * input2
 6
 1 1 9 1 1 1
 0
 * output2
 5
 */
public class Process {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int priority : priorities) queue.offer(priority);

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				System.out.println(queue);
				if (priorities[i] == queue.peek()) {

					if (i == location) {
						answer++;
						return answer;
					}
					queue.poll();
					answer++;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Process T = new Process();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] priorities = new int[n];
		for (int i = 0; i < n; i++)
			priorities[i] = kb.nextInt();
		int location = kb.nextInt();
		System.out.println(T.solution(priorities, location));
	}
}
