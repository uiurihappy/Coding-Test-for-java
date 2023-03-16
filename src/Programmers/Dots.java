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
public class Dots {

	static int status = 0;
	static int[][] dots;

	public void solution(int[][] dots) {
		ArrayList<Double> arr = new ArrayList<>();

		for (int i = 0; i < dots.length - 1; i++) {
			if (status == 1) {
				break;
			} else {
				for (int j = i + 1; j < dots.length; j++) {
					double temp = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
					if (arr.contains(temp)) {
						status = 1;
						break;
					} else {
						arr.add(temp);
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Dots T = new Dots();
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
		System.out.println(status);
	}
}
