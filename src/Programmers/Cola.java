package Programmers;

import java.util.Scanner;

/** 콜라 문제
 * 빈 병 20개 중 18개를 마트에 가져가서, 6병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 8(20 – 18 + 6 = 8)개 입니다.
 * 빈 병 8개 중 6개를 마트에 가져가서, 2병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 4(8 – 6 + 2 = 4)개 입니다.
 * 빈 병 4 개중 3개를 마트에 가져가서, 1병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 2(4 – 3 + 1 = 2)개 입니다.
 * 3번의 교환 동안 상빈이는 9(6 + 2 + 1 = 9)병의 콜라를 받았습니다.
 * input1
 2 1 20
 * output1
 19
 * input2
 3 1 20
 * output2
 9
 */
public class Cola {

	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) {
			answer += b * (n / a);
			n = b * (n / a) +  n % a;
		}
		return answer;
	}

	public static void main(String[] args) {
		Cola T = new Cola();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int n = kb.nextInt();
		System.out.println(T.solution(a, b, n));
	}
}
