package Programmers.Lv2;

import java.util.Scanner;

/** 다음 큰 숫자
 * input1
 78
 * output1
 83
 * input2
 15
 * output2
 23
 */
public class NextBigNum {

	public int solution(int n) {
		int answer = 0;
		int bCnt = Integer.bitCount(n);
		int bNum = 0;
		while (true) {
			n++;
			bNum = Integer.bitCount(n);
			if (bNum == bCnt) {
				answer = n;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		NextBigNum T = new NextBigNum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}
