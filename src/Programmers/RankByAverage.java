package Programmers;

import java.util.*;

/** 등수 메기기
 * input1
4 2
80 70
90 50
40 70
50 80
 * output1
 1 2 4 3
 */
public class RankByAverage {

	// 효율 똥망 코드, 그런데 영어, 수학뿐만 아니라 다른 과목 추가 되면 우짤겨...
//	public int[] solution(int[][] score) {
//		int[] answer = new int[score.length];
//		double[] avg = new double[score.length];
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++)
//				sum += score[i][j];
//			avg[i] = (double) sum / score[i].length;
//			sum = 0;
//		}
//		for (int i = 0; i < avg.length; i++) {
//			int count = 0;
//			for (int j = 0; j < avg.length; j++) {
//				if (avg[j] > avg[i]) {
//					count++;
//				}
//				answer[i] = count + 1;
//			}
//		}
//		return answer;
//	}

	// indexof는 좀 좋은 듯
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		List<Integer> scoreList = new ArrayList<>();
		for(int[] t : score)
			scoreList.add(t[0] + t[1]);

		scoreList.sort(Comparator.reverseOrder());

		System.out.println("scoreList = " + scoreList);

		for(int i = 0; i < score.length; i++)
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;

		return answer;
	}

	public static void main(String[] args) {
		RankByAverage T = new RankByAverage();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();   // n
		int m = kb.nextInt();   // 2
		int[][] score = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				score[i][j] = kb.nextInt();

		for (int x : T.solution(score))
			System.out.print(x + " ");
	}
}
