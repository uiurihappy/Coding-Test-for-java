package Chapter1;

import java.util.Scanner;
/** 중복문자제거
 * input:  ksekkset
 * output: kset
 */
class Problem6 {

	public String solution(String str){
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
