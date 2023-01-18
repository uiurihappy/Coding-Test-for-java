package String;

import java.util.*;

class Problem4 {

	public ArrayList<String> solution (int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			StringBuffer sb = new StringBuffer(x);
			answer.add(sb.reverse().toString());
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
