package Programmers;

import java.util.*;

/** 두 개 뽑아서 더하기
 * input1
 5
 2 1 3 4 1
 * output1
 2 3 4 5 6 7
 * input2
 4
 5 0 2 7
 * output2
 2 5 7 9 12
 */
public class PickTwoAdd {

	public int[] solution(int[] numbers) {
		ArrayList<Integer> answer = new ArrayList<>();

		// sol 2 (set을 사용해도 됨)
//		Set<Integer> answer = new HashSet<>();
//
//		for(int i=0; i<numbers.length; i++) {
//			for(int j=i+1; j<numbers.length; j++) {
//				answer.add(numbers[i] + numbers[j]);
//			}
//		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int num = numbers[i] + numbers[j];
				if (!answer.contains(num)) {
					answer.add(num);
				}
			}
		}
		return answer.stream().sorted().mapToInt(Integer::intValue).toArray();

	}

	public static void main(String[] args) {
		PickTwoAdd T = new PickTwoAdd();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++)
			numbers[i] = kb.nextInt();
		for (int x : T.solution(numbers))
			System.out.print(x + " ");
	}
}
