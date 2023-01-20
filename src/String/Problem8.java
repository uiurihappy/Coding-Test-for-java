package String;

import java.util.Scanner;

/*
	input: found7, time: study; Yduts; emit, 7Dnuof
	output: YES
 */
class Problem8 {

//	public String solution(String str){
//		String answer = "";
//		StringBuilder temp = new StringBuilder();
//		char[] s = str.toCharArray();
//
//		for (char x : s){
//			if (Character.isAlphabetic(x)) {
//				temp.append(x);
//			}
//		}
//		str = String.valueOf(temp);
//
//		str = str.toLowerCase();
//		int lt = 0, rt = str.length() - 1;
//		char[] t = str.toCharArray();
//
//		while (lt < rt) {
//			if(t[lt] != t[rt]){
//				answer = "NO";
//				break;
//			}
//			lt++;
//			rt--;
//			answer = "YES";
//		}
//
//		return answer;
//	}

	public String solution(String str) {
		String anwser = "NO";
		// 정규식 사용: replaceAll, 사용x: replace, ^는 부정
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp = new StringBuilder(str).reverse().toString();

		if(str.equals(temp)){
			return "YES";
		}

		return anwser;
	}

	public static void main(String[] args) {
		Problem8 T = new Problem8();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
