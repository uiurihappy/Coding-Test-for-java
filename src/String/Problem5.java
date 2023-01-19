package String;

import java.util.*;

class Problem5 {

	public String solution(String str) {
		String answer = "";
		char[] subStr = str.toCharArray();

		int lt = 0, rt = str.length() - 1;
		while(lt < rt) {
			// Character.isAlphabetic 아스키코드를 조회해서 알파벳인지 boolean 값으로 return
			if (!Character.isAlphabetic(subStr[lt])) {
				lt++;
			}else if (!Character.isAlphabetic(subStr[rt])) {
				rt--;
			}else{
				// Swap
				char tmp = subStr[lt];
				subStr[lt] = subStr[rt];
				subStr[rt] = tmp;

				// 알파벳이면 index 동시 증가
				lt++;
				rt--;
			}
		}

		// String array 를 String 화 시켜준다.
		answer = String.valueOf(subStr);


		return answer;
	}

	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
