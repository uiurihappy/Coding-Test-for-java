package Programmers;

import java.util.*;

/** 평행
 * 선이 평행하다는 건 두 선의 기울기가 같다는 걸 의미
 * 공식: y2 - y1 / x2 - x1
 * input1
 1 4
 9 2
 3 8
 11 6
 * output1
 1
 * input2
 3 5
 4 1
 2 4
 5 10
 * output2
 0
 */
public class ParallelByDots {

	static int answer = 0;
	static int[][] dots;

	public void solution(int[][] dots) {
		double[] line = new double[6];
		int idx = 0;
		for (int i = 0; i < dots.length - 1; i++) {
			for (int j = i + 1; j < dots.length; j++) {
				double temp = Math.abs((double) (dots[i][1] - dots[j][1]) / (double) (dots[i][0] - dots[j][0]));
				line[idx] = temp;
				idx++;
			}
		}
		// 평행 체크
		for(int k = 0; k < line.length-1 ; k++){
			for(int m=k+1; m<line.length;m++) {
				if (line[k] == line[m]) answer = 1;
			}
		}

	}

	public static void main(String[] args) {
		ParallelByDots T = new ParallelByDots();
		Scanner kb = new Scanner(System.in);
		dots = new int[4][2];

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 2; j++)
				dots[i][j] = kb.nextInt();

//		for (int i = 0; i < 4; i++){
//			for (int j = 0; j < 2; j++) {
//				System.out.print(dots[i][j] + " ");
//			}
//			System.out.println();
//		}
		T.solution(dots);
		System.out.println(answer);
	}
}
