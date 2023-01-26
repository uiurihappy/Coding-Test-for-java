package Chapter1;

import java.util.*;
/*
	input: 	teachermode e
	output	1 0 1 2 1 0 1 2 2 1 0
 */

class Problem10 {

	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		int p = 1000;

		// 왼쪽으로부터 떨어진 거리 계산
		for (int i =0; i < str.length(); i++){
			if (str.charAt(i) == t) {
				p = 0;
			} else {
				p++;
			}
			answer[i] = p;
		}
		// init p
		p = 1000;

		for (int i = str.length() - 1; i >= 0; i--){
			if (str.charAt(i) == t) {
				p = 0;
				// p값을 넣으면 안된다. 그러면 역순으로 수가 계속 증가함
			} else {
				p++;
				// 둘 중 작은 값으로 대입
				answer[i] = Math.min(answer[i], p);
			}
		}

		// 신기하네... 다시 풀어보자
		return answer;
	}

	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		// 문자 한개를 읽을 때는 이렇게 한다.
		char t = kb.next().charAt(0);
		for(int x : T.solution(str, t)) {
			System.out.print(x + " ");
		}
	}
}
