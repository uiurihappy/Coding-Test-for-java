package Chapter1;

import java.util.Scanner;
/** 숫자만 추출
 * input:  g0en2T0s8eSoft
 * output: 208
 */
class Problem9 {

//	public int solution(String str) {
//		StringBuilder answer = new StringBuilder();
//		char[] arr = str.toCharArray();
//
//		for(char x : arr) {
//			if((int)x <= 57 && (int)x >= 48) {
//				answer.append(x);
//			}
//		}
//
//		return Integer.parseInt(String.valueOf(answer));
//	}

	public int solution(String str) {
//		int answer = 0;
		String answer = "";
		for (char x : str.toCharArray()){
//			if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
			// Character.isDigit 문자가 숫자인 지 판별
			if (Character.isDigit(x)) answer += x;
		}

//		return answer;
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Problem9 T = new Problem9();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
