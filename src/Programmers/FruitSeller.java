package Programmers;

import java.util.*;

/** 과일 장수
 * input1
 3 4 7
 1 2 3 1 2 3 1
 * output1
 8
 * input2
 4 3 12
 4 1 2 2 4 4 4 4 1 2 4 2
 * output2
 33
 */
public class FruitSeller {

	public int solution(int k, int m, int[] score) {
		int answer = 0;

		// sol 1
//		Integer[] scoreArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
//		Arrays.sort(scoreArr, Collections.reverseOrder());
//
//		for (int i = 0; i < scoreArr.length; i++) {
//			if ((i + 1) % m == 0)
//				answer += scoreArr[i] * m;      // m의 배수일 때만 해당 사과로 계산
//		}

		// sol 2
//		Arrays.sort(score);
//		for (int i = score.length; i >= m; i-=m)
//			answer += score[i - m] * m;

		// sol 3
		Arrays.sort(score);

		for (int i = score.length - 1; i >= 0; i--)
			if ((score.length - i) % m == 0)
				answer += score[i] * m;

		return answer;
	}

	public static void main(String[] args) {
		FruitSeller T = new FruitSeller();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int m = kb.nextInt();

		int n = kb.nextInt();
		int[] score = new int[n];

		for(int i = 0; i < n; i++)
			score[i] = kb.nextInt();

		System.out.println(T.solution(k, m, score));
	}
}
