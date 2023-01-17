package String;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

class Problem3 {

	public String solution(String str) {
		String[] subStr = str.split(" ");

		Optional<String> max = Arrays.stream(subStr).max( (a, b) -> {
			return Integer.compare(a.length(), b.length());
		});
		System.out.println(max);
		return max.get();
	}

	public static void main(String[] args) {
		Problem3 T = new Problem3();

		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.println(T.solution(str));
	}
}
