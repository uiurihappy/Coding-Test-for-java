package String;

import java.util.*;

class Problem5 {

	public String solution(String str) {
		String answer = "";
		char[] subStr = str.toCharArray();

		int lt = 0, rt = str.length() - 1;
		while(lt < rt) {
			if (!Character.isAlphabetic(subStr[lt])) {
				lt++;
			}else if (!Character.isAlphabetic(subStr[rt])) {
				rt--;
			}else{
				char tmp = subStr[lt];
				subStr[lt] = subStr[rt];
				subStr[rt] = tmp;
				lt++;
				rt--;
			}
		}
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
