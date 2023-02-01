package Chapter4;

import java.util.*;
/*
** 아나그램
* input 1
AbaAeCe
baeeACA
* input 2
abaCC
Caaab

* output 1
YES
* output 2
NO
 */
class Problem2 {

	public String solution(String str1, String str2) {
		String answer = "NO";
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char x : str1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0) + 1);
		}

		for (char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}
		if (map1.equals(map2)) return "YES";

		return answer;
	}
	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		String str1 = kb.next();
		String str2 = kb.next();

		System.out.println(T.solution(str1, str2));
	}
}
