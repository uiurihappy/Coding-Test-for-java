package String;

import java.util.Scanner;

class Problem12 {

//	public String solution(int n, String str){
//		StringBuilder answer = new StringBuilder();
//
//		for (int i = 0; i < n * 7; i += 7) {
//			String numString = str.substring(i, i + 7);
//			int binary = Integer.parseInt(numString.replaceAll("#", "1").replaceAll("*", "0"));
//			char temp =(char) Integer.parseInt(String.valueOf(binary), 2);
//			answer.append(temp);
//		}
//
//		return answer.toString();
//	}

	public String solution(int n, String str) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(temp, 2);
			answer += (char) num;

			str = str.substring(7);
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));

	}
}
