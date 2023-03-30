package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** 숫자 짝궁
 * input1
 100 2345
 * output1
 -1
 * input2
 100 203045
 * output2
 0
 * input3
 100 123450
 * output3
 10
 * input4
 12321 42531
 * output4
 321
 * input5
 5525 1255
 * output5
 552
 */
public class NumberPair {

	public String solution(String X, String Y) {
		int[] cntX = new int[10];
		int[] cntY = new int[10];

		for (String tempX : X.split("")) cntX[Integer.parseInt(tempX)]++;
		for (String tempY : Y.split("")) cntY[Integer.parseInt(tempY)]++;

		StringBuilder sb = new StringBuilder();

		for (int i = 9; i >= 0; i--) {
			while (cntX[i] > 0 && cntY[i] > 0) {
				sb.append(i);
				cntX[i]--;
				cntY[i]--;
			}
		}

		if ("".equals(sb.toString()))
			return "-1";
		else if ("0".equals(sb.toString().substring(0, 1)))
			return "0";
		else
			return sb.toString();
	}

	public static void main(String[] args) {
		NumberPair T = new NumberPair();
		Scanner kb = new Scanner(System.in);
		String X = kb.next();
		String Y = kb.next();
		System.out.println(T.solution(X, Y));
	}
}
