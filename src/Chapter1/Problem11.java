package Chapter1;

import java.util.*;
/*
	input1: 	KKHSSSSSSSE
	output1:	K2HS7E

	input2: 	KSTTTSEEKFKKKDJJGG
	output2: 	KST3SE2KFK3DJ2G2
 */
class Problem11 {

//	  // solution 1
//	  public String solution(String str) {
//		StringBuilder answer = new StringBuilder();
//		char[] s = str.toCharArray();
//		int cnt = 1;
//		char temp = s[0];
//
//		for(int i = 1; i < s.length; i++){
//			if (temp == s[i]) cnt++;
//			else {
//				if (cnt != 1) {
//					answer.append(temp).append(cnt);
//				}else{
//					answer.append(temp);
//				}
//				temp = s[i];
//				cnt = 1;
//			}
//		}
//
//		if (cnt != 1) {
//			answer.append(temp).append(cnt);
//		}else{
//			answer.append(temp);
//		}
//
//		return answer.toString();
//	}

	public String solution (String str) {
		String answer = "";
		str = str + " ";
		int cnt = 1;
		for(int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else{
				answer += str.charAt(i);
				if (cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
