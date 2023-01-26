package Chapter1;

import java.util.Scanner;
/*
	input:  gooG
	output: YES
 */
class Problem7 {

//	public String solution (String str) {
//		String answer = "YES";
//		str = str.toLowerCase();
//		int lt = 0, rt = str.length() - 1;
//		char[] t = str.toCharArray();
//
//		while (lt < rt) {
//			if(t[lt] != t[rt]){
//				return "NO"
//			}
//			lt++;
//			rt--;
//		}
//
//		return answer;
//	}

//	public String solution(String str) {
//		String answer = "YES";
//		int len = str.length();
//		str = str.toUpperCase();
//
//		for (int i = 0; i < len / 2; i++){
//			if(str.charAt(i) != str.charAt(len - i - 1))
//				return "NO";
//		}
//
//		return answer;
//	}

	public String solution(String str) {
		String answer = "YES";
		String temp = new StringBuilder(str).reverse().toString();

		if (!str.equalsIgnoreCase(temp)){
			return "NO";
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem7 T = new Problem7();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
