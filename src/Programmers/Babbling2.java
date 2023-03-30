package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/** 옹알이 (2)
 * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는
 * 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
 * input1
 5
 aya yee u maa
 * input2
5
ayaye uuu yeye yemawoo ayaayaa
 * output1
 1
 * output2
 2
 */
public class Babbling2 {


	static int n;
	static String[] babbling;

	public int solution(String[] babbling) {
		int answer = 0;
		for (int i = 0; i < babbling.length; i++) {
			// "wyeoo" 이면 "ye"를 지우면 "woo"가 되기 때문에
			// 1로 replace해서 1을 공백 처리 한다.
			// 번거롭지만 예외 처리 때문에 해야 함
			if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama"))
				continue;

			babbling[i] = babbling[i].replace("aya", "1");
			babbling[i] = babbling[i].replace("woo", "1");
			babbling[i] = babbling[i].replace("ye", "1");
			babbling[i] = babbling[i].replace("ma", "1");
			babbling[i] = babbling[i].replace("1", "");
//            System.out.println(babbling[i]);

			if (babbling[i].length() == 0)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Babbling2 T = new Babbling2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		babbling = new String[n];

		for (int i = 0; i < n; i++)
			babbling[i] = kb.next();

		System.out.println(T.solution(babbling));
	}
}
