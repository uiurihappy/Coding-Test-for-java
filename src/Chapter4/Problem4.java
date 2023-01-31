package Chapter4;

import java.util.HashMap;
import java.util.Scanner;

class Problem4 {

	public int solution(String s, String t) {
		int answer = 0, slen = s.length(), tlen = t.length() - 1;
		HashMap<Character, Integer> smap = new HashMap<>();
		HashMap<Character, Integer> tmap = new HashMap<>();

		for (char x : t.toCharArray())
			tmap.put(x, tmap.getOrDefault(x, 0) + 1);

		// 마찬가지로 쪼개서 탐색한다.
		for (int i = 0; i < tlen; i++)
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);

		int lt = 0;

		for (int rt = tlen; rt < slen; rt++) {
			smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0) + 1);

			// key, value 다 같으면 true, 하나라도 아니면 false
			if (smap.equals(tmap))
				answer++;

			smap.put(s.charAt(lt), smap.get(s.charAt(lt)) - 1);
			if (smap.get(s.charAt(lt)) == 0)
				smap.remove(s.charAt(lt));
			lt++;

		}

		return answer;
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();

		System.out.println(T.solution(s, t));
	}
}
