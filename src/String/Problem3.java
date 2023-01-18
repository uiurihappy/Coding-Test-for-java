package String;

import java.util.*;

class Problem3 {

	public String solution(String str) {
//		String[] subStr = str.split(" ");
//
//		Optional<String> max = Arrays.stream(subStr).max( (a, b) -> {
//			return Integer.compare(a.length(), b.length());
//		});
//		return max.get();
		String answer = "";
		int max = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();

		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();

		System.out.println(T.solution(str));
	}
}
