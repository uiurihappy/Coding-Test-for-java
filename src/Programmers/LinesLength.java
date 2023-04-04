package Programmers;

import java.util.*;

/** 겹치는 선분의 길이
 * input1
 0 1
 2 5
 3 9
 * output1
 2
 * input2
 0 5
 3 9
 1 10
 * output2
 8
 */
public class LinesLength {

	static int[][] lines;
	public int solution(int[][] lines) {

		int answer = 0;

		Map<String, Integer> map = new HashMap<>();

		for (int[] line : lines) {
			int tempMin = Math.min(line[0], line[1]);
			int tempMax = Math.max(line[0], line[1]);
			for (int i = tempMin + 1; i < tempMax + 1; i++) {
				String str = (i - 1) + "/" + i;
				map.put(str, map.getOrDefault(str, 0) + 1);
			}
		}

		for (Integer value : map.values())
			if (value > 1) answer++;

		return answer;


//		int answer = 0;
//		int[] lineArr = new int[200];
//		for (int[] line : lines) {
//			int min = Math.min(line[0], line[1]);
//			int max = Math.max(line[0], line[1]);
//			for (int i = min; i < max + 1; i++)
//				lineArr[i + 100]++;
//
//		}
//
//		for (int i = 1; i < lineArr.length; i++) {
//			if (lineArr[i - 1] > 1 && lineArr[i] > 1)
//				answer++;
//		}
//
//		return answer;
	}
	public static void main(String[] args) {
		LinesLength T = new LinesLength();
		Scanner kb = new Scanner(System.in);
		lines = new int[3][2];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
				lines[i][j] = kb.nextInt();

		System.out.println(T.solution(lines));

	}
}
