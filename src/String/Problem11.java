package String;

import java.util.*;

class Problem11 {

	public String solution(String str) {
		StringBuilder answer = new StringBuilder();
		char[] s = str.toCharArray();
		int cnt = 1;
		char temp = s[0];

		for(int i = 1; i < s.length; i++){
			if (temp == s[i]) cnt++;
			else {
				if (cnt != 1) {
					answer.append(temp).append(cnt);
				}else{
					answer.append(temp);
				}
				temp = s[i];
				cnt = 1;
			}
		}

		if (cnt != 1) {
			answer.append(temp).append(cnt);
		}else{
			answer.append(temp);
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
