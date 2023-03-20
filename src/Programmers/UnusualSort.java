package Programmers;

import java.util.*;

/** 특이한 정렬
 * input1
 6
 1 2 3 4 5 6
 4
 * output1
 4 5 3 6 2 1
 * input2
 8
 10000 20 36 47 40 6 10 7000
 30
 * output2
 */
public class UnusualSort {

	public int[] solution(int[] numlist, int n) {
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(numlist);   // 정렬 후
		for (int num: numlist) answer.add(num); // answer에 넣는다.
		// 정렬 기준으로 각 숫자에서 n을 뺀 절대값
		answer.sort((a, b) ->
			Integer.compare(Math.abs(b - n), Math.abs(a - n)));
		// 처음부터 오름차순 정렬을 하면, 절댓값이 같은 숫자들의 위치가 원하는 대로 나오지 않음
		Collections.reverse(answer);

		// int[]로 변환
		return answer.stream().mapToInt(num -> num).toArray();
	}

	public static void main(String[] args) {
		UnusualSort T = new UnusualSort();
		Scanner kb = new Scanner(System.in);
		int nn = kb.nextInt();
		int[] numlist = new int[nn];
		for (int i = 0; i < nn; i++)
			numlist[i] = kb.nextInt();
		int n = kb.nextInt();

		for (int x : T.solution(numlist, n))
			System.out.print(x + " ");
	}

}
