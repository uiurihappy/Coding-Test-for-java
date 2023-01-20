package String;

import java.util.Scanner;

class Problem7 {

	public String solution (String str) {
		String answer = "";
		str = str.toLowerCase();
		int lt = 0, rt = str.length() - 1;
		char[] t = str.toCharArray();

		while (lt < rt) {
			if(t[lt] != t[rt]){
				answer = "NO";
				break;
			}
			lt++;
			rt--;
			answer = "YES";
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
