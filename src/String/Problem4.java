package String;

import java.util.*;

class Problem4 {

	public ArrayList<String> solution (int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		/*
		* solution 1
		for (String x : str) {
			StringBuilder sb = new StringBuilder(x);
			answer.add(sb.reverse().toString());
//			String sb = new StringBuilder(x).reverse().toString();
//			answer.add(sb);
		}
		return answer;
		 */

		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}

		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
