package Chapter5;

import java.util.*;
/*
** 교육과정 설계
 * input1
CBA
CBDAGE
 * output1
YES

 * input2
CBA
CABBACE
 * output2
NO
 */
class Problem7 {

	public String solution (String need, String plan) {
		Queue<Character> queue = new LinkedList<>();

		for (char x : need.toCharArray()) queue.offer(x);

		// solution 1
//      String answer = "NO";
//		for (char x : plan.toCharArray()) {
//			if (queue.isEmpty())
//				return "YES";
//			if (x == queue.peek())
//				queue.poll();
//		}

		// solution 2
		String answer = "YES";
		for (char x : plan.toCharArray()) {
			if (queue.contains(x)) {
				// poll 한 값이 안맞아서 바로 NO를 return
				if (x != queue.poll()) return "NO";
			}
		}

		// 큐가 비어있지 않으면 아직 계획보다 필수과목이 더 남았기에 NO
		if (!queue.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		Problem7 T = new Problem7();
		Scanner kb = new Scanner(System.in);
		String need = kb.next();
		String plan = kb.next();

		System.out.println(T.solution(need, plan));
	}
}
