package Programmers;

import java.util.Scanner;
/** 옹알이 (2)
 * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는
 * 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
 * input1
 5
 aya yee u maa wyeoo
 * input2
 5
 ayaye uuuma ye yemawoo ayaa
 * output1
 1
 * output2
 3
 */
public class Babbling2 {


	static int n, answer = 0;
	static String[] babbling;

	public void solution(String[] babbling) {

		for (int i = 0; i < babbling.length; i++) {
			// "wyeoo" 이면 "ye"를 지우면 "woo"가 되기 때문에
			// 1로 replace해서 1을 공백 처리 한다.
			// 번거롭지만 예외 처리 때문에 해야 함
			babbling[i] = babbling[i].replaceFirst("aya", "1");
			babbling[i] = babbling[i].replaceFirst("woo", "1");
			babbling[i] = babbling[i].replaceFirst("ye", "1");
			babbling[i] = babbling[i].replaceFirst("ma", "1");
			babbling[i] = babbling[i].replace("1", "");
//            System.out.println(babbling[i]);

			if (babbling[i].isEmpty())
				answer++;
		}

	}

	public static void main(String[] args) {
		Babbling2 T = new Babbling2();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		babbling = new String[n];

		for (int i = 0; i < n; i++)
			babbling[i] = kb.next();

		T.solution(babbling);

		System.out.println(answer);
	}
}
