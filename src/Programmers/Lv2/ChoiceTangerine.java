package Programmers.Lv2;

import java.util.*;

/** 귤 고르기
 * input1
 6 8
 1 3 2 5 4 5 2 3
 * output1
 3
 * input2
 4 8
 1 3 2 5 4 5 2 3
 * output2
 2
 * input3
 2 8
 1 1 1 1 2 2 2 3
 * output3
 1
 */
public class ChoiceTangerine {

	public int solution(int k, int[] tangerine) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();

		// 귤 사이즈 별 map
		for (int size : tangerine)
			map.put(size, map.getOrDefault(size, 0) + 1);

		// keySet으로 distinct
		List<Integer> tan = new ArrayList<>(map.keySet());

		// 내림차순
		tan.sort((o1, o2) -> map.get(o2) - map.get(o1));

		int i = 0;
		while (k > 0) {
			k -= map.get(tan.get(i));
			answer++;
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		ChoiceTangerine T = new ChoiceTangerine();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int[] tangerine = new int[n];

		for (int i = 0; i < n; i++)
			tangerine[i] = kb.nextInt();

		System.out.println(T.solution(k, tangerine));
	}
}
