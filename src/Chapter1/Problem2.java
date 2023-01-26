package Chapter1;

import java.util.Scanner;

class Problem2 {

	public String solution(String str){
		String answer = "";
		int temp;

//		for(int i =0; i < str.length(); i++){
//			temp = (int)str.charAt(i);
//
//			if (temp >= 65 && temp <= 90) {
//				answer += (char)(temp + 32);
//			}else if (temp >= 97 && temp <= 122){
//				answer += (char)(temp - 32);
//			}else{
//				answer += (char)(temp);
//			}
//		}

		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
			else answer += x;
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
