package Chapter1;

import java.util.*;

/** 문장 속 단어
 * input
 it is time to study
 * output
 study
 */
class Problem3 {

	public String solution(String str) {
		/*
		* solution 1
		String[] subStr = str.split(" ");

		Optional<String> max = Arrays.stream(subStr).max( (a, b) -> {
			return Integer.compare(a.length(), b.length());
		});
		return max.get();
		 */

		/*
		* solution 2
		String answer = "";
		int max = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		return answer;
		*/

		String answer = "";

		int m = Integer.MIN_VALUE, pos;

		// 띄어쓰기의 위치를 return 받는다.
		while((pos = str.indexOf(' ')) != -1){
			String temp = str.substring(0, pos); // it, is, time, to, study 루프만큼 저장

			int len = temp.length();

			if(len > m) {
				m = len;
				answer = temp;
			}
			str = str.substring(pos + 1); // it 부터 앞 단어들은 삭제
		}
		// 마지막 단어의 길이가 m보다 크면 answer에 저장
		if(str.length() > m) answer = str;

		return answer;
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();

		Scanner kb = new Scanner(System.in);
		// 한 줄을 입력 받아야 하니 nextLine으로 받는다.
		String str = kb.nextLine();

		System.out.println(T.solution(str));
	}
}
