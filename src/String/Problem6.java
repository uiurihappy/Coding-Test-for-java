package String;

import java.util.Scanner;

class Problem6 {

	public String solution(String str){
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			for (int j = i; j <= str.length(); j++) {
				if(t != str.charAt(j)) {
					answer += t;
					break;
				}else{
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
