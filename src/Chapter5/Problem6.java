package Chapter5;

import java.util.*;
/*
** 공주 구하기
* input
8 3
* output
7
 */
class Problem6 {

	public int solution (int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			queue.offer(i);

		while (queue.size() != 1) {
			// k번재 수가 아니면 다시 큐에 입력
			for (int i = 1; i < k; i++) {
//				System.out.print(queue.peek() + " ");
				// poll로 뺀 값을 큐의 뒤로 add
				queue.offer(queue.poll());
			}
//			System.out.println(queue);
			// k - 1 번째까지 루프를 돌았으니 k번째는 poll
			queue.poll();
		}
		answer = queue.poll();

		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();

		System.out.println(T.solution(n, k));
	}
}
