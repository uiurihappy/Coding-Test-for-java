package Brandi;

import java.util.*;

public class Problem2 {

	public int[] solution(int[] ball, int[] order) {
		int[] answer = new int[ball.length];
		List<Integer> list = new ArrayList<>();
		for (int b : ball) {
			list.add(b);
		}
		int idx = 0;
		int left = 0, right = list.size() - 1;
		while (idx < order.length) {
			int current = order[idx];
			if (current == list.get(left)) {
				answer[idx] = list.remove(left);
				idx++;
				continue;
			} else if (current == list.get(right)) {
				answer[idx] = list.remove(right);
				idx++;
				continue;
			} else {
				for (int i = left + 1; i < right; i++) {
					int num = list.get(i);
					if (current == num) {
						answer[idx] = list.remove(i);
						idx++;
						break;
					}
				}
			}
			// 공이 보류된 경우 (왼쪽과 오른쪽 어느쪽으로 빠져나갈 수 있어야 하는 경우)
			if (idx < order.length) {
				int next = order[idx];
				int leftIdx = list.indexOf(next);
				int rightIdx = list.lastIndexOf(next);
				if (leftIdx == left + 1) {
					answer[idx] = list.remove(leftIdx);
					idx++;
					left++;
				} else if (rightIdx == right - 1) {
					answer[idx] = list.remove(rightIdx);
					idx++;
					right--;
				}
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
