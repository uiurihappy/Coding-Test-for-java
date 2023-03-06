package Brandi;

import java.util.*;

public class Problem2 {
	public ArrayList<Integer> solution(int n, int[] bi, int[] ci) {
		ArrayList<Integer> answer = new ArrayList<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++)
			queue.offer(bi[i]);

		while(!queue.isEmpty()) {
			int item = queue.poll();
			System.out.println(item);
			for (int i = 0; i < bi.length; i++) {
				System.out.println(ci[i] + " " + bi[i] + " " + item);
				if (ci[i] == bi[i] || item == bi[i]) {
					answer.add(item);
				}
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
