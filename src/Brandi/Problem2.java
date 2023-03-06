package Brandi;

import java.util.*;

public class Problem2 {
	public ArrayList<Integer> solution(int n, int[] bi, int[] ci) {
		ArrayList<Integer> answer = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++)
			queue.offer(bi[i]);
		System.out.println(queue.peek());
		int i = 0;
		while(!queue.isEmpty()) {
			OptionalInt first = Arrays.stream(bi).findFirst();
			System.out.println(first.getAsInt() == ci[i] || queue.peek() == ci[i]);
			if (first.getAsInt() == ci[i] || queue.peek() == ci[i]) {
				answer.add(queue.poll());
				i++;
			} else {
				queue.offer(queue.poll());
			}
			queue.poll();
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

		for (int x : T.solution(n, bi, ci)) {
			System.out.print(x + " ");
		}
	}
}
