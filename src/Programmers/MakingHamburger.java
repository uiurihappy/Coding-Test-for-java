package Programmers;

import java.util.*;

/** 햄버거 만들기
 * input1
 9
 2 1 1 2 3 1 2 3 1
 * output1
 2
 * input2
 9
 1 3 2 1 2 1 3 1 2
 * output2
 0
 */
public class MakingHamburger {

	public int solution(int[] ingredient) {
		int answer = 0;
		// ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미
		// 1 2 3 1 순으로 된 햄버거 수를 return

		// sol 1
		Stack<Integer> elements = new Stack<>();
		for (int element : ingredient) {
			elements.push(element);
			if (elements.size() >= 4) {
				if (elements.get(elements.size() - 4) == 1
				&& elements.get(elements.size() - 3) == 2
				&& elements.get(elements.size() - 2) == 3
				&& elements.get(elements.size() - 1) == 1) {
					answer++;
					elements.pop();
					elements.pop();
					elements.pop();
					elements.pop();
				}
			}
		}
		// sol 2
//		StringBuilder pack = new StringBuilder();
//		for (int i : ingredient) pack.append(i);
//
//		int index = pack.indexOf("1231");
//
//		while (index != -1) {
//			pack = pack.delete(index, index + 4);
//			answer++;
//			index = pack.indexOf("1231");
//		}

		return answer;
	}

	public static void main(String[] args) {
		MakingHamburger T = new MakingHamburger();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] ingredient = new int[n];

		for (int i = 0; i < n; i++)
			ingredient[i] = kb.nextInt();
		System.out.println(T.solution(ingredient));
	}
}
