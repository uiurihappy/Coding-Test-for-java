package Programmers.Lv2;

import java.util.*;

/** 의상
 * input1
 3
 yellow_hat headgear
 blue_sunglasses eyewear
 green_turban headgear
 * output1
 5

 * input2
 3
 crow_mask face
 blue_sunglasses face
 smoky_makeup face
 * output2
 3
 */
public class Clothes {

	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		for (String[] clothe: clothes) {
			String type = clothe[1];
			map.put(type, map.getOrDefault(type, 0) + 1);
		}

		for (Integer integer : map.values())
			answer *= integer + 1;

		return answer - 1;

		// sol 2 (이건 진짜 대박인듯..)
//		return Arrays.stream(clothes)
//				.collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
//				.values()
//				.stream()
//				.collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	}

	public static void main(String[] args) {
		Clothes T = new Clothes();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[][] clothes = new String[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				clothes[i][j] = kb.next();
			}
		}
		System.out.println(T.solution(clothes));
	}
}
