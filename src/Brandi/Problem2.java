package Brandi;

import java.util.*;

/** 4621 : 공 꺼내기
 * url: http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=3980&sca=99&page=32
 * input1
 6
 1 2 3 4 5 6
 6 5 2 1 4 3
 * output1
 6 5 1 2 4 3
 * input2
 5
 11 2 9 13 24
 9 2 13 24 11
 * output2
 24 13 9 2 11
 */
public class Problem2 {
	public int[] solution(int[] ball, int[] order) {
		int[] answer = new int[ball.length];
		int answerIndex = 0;

		// ball에 있는 공들을 순차적으로 확인하면서 빼낸 공을 answer에 넣어줍니다.
		// 빼낸 공이 보류 상태였을 경우, 다시 확인해 빼낼 수 있는 공인지 확인합니다.
		Deque<Integer> deque = new ArrayDeque<>();
		for (int b : ball) deque.offerLast(b);
		Set<Integer> pending = new HashSet<>();

		for (int o : order) {
			// order에 있는 공을 빼내기 위해 순차적으로 확인합니다.
			// 빼내려는 공이 보류 상태이면, 그 공을 다시 큐의 맨 앞 또는 맨 뒤로 보내줍니다.
			// 빼내려는 공이 바로 빼낼 수 있는 경우, 큐에서 빼내고 answer에 넣어줍니다.
			if (deque.peekFirst() == o) {
				deque.pollFirst();
				answer[answerIndex++] = o;

				// 이전에 보류 상태인 공이 빠져나갈 수 있는지 확인합니다.
				while (pending.contains(deque.peekFirst())) {
					int pendingBall = deque.pollFirst();
					pending.remove(pendingBall);
					answer[answerIndex++] = pendingBall;
				}
			} else if (deque.peekLast() == o) {
				deque.pollLast();
				answer[answerIndex++] = o;

				// 이전에 보류 상태인 공이 빠져나갈 수 있는지 확인합니다.
				while (pending.contains(deque.peekLast())) {
					int pendingBall = deque.pollLast();
					pending.remove(pendingBall);
					answer[answerIndex++] = pendingBall;
				}
			} else {
				pending.add(o);
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] bi = new int[n];
		int[] ci = new int[n];
		for (int i = 0; i < n; i++)
			bi[i] = kb.nextInt();
		for (int i = 0; i < n; i++)
			ci[i] = kb.nextInt();

		for (int x : T.solution(bi, ci)) {
			System.out.print(x + " ");
		}
	}
}
