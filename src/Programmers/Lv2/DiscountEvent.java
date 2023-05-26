package Programmers.Lv2;

import java.util.*;

/** 할인 행사
 * input1
 5
 banana apple rice pork pot
 3 2 2 2 1
 14
 chichen apple apple banana rice apple pork banana pork rice pot banana apple banana
 * output1
 3
 * input2
 1
 apple
 10
 10
 banana banana banana banana banana banana banana banana banana banana
 * output2
 *
 */
public class DiscountEvent {

	public Boolean isEqual(Map<String, Integer> wantMap, Map<String, Integer> compareMap) {
		for (String key : wantMap.keySet()) {
			if (!compareMap.containsKey(key) || wantMap.get(key) != compareMap.get(key)) {
				return false;
			}
		}
		return true;
	}

	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < want.length; i++)
			map.put(want[i], number[i]);

		Map<String, Integer> discountMap = new HashMap<>();

		for (int i = 0; i < 10; i++)
			discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);

		// 첫번째 날
		if (isEqual(map, discountMap))
			answer++;

		// 두번째 날부터는 삭제할 상품 과 추가할 상품을 지정하여 discountMap을 업데이트 하고
		// 업데이트 된 내용을 바탕으로 isEqual 메서드를 실행하여 answer의 값을 변경한다.
		for (int i = 1; i <= discount.length - 10; i++) {
			String deleteItem = discount[i - 1];
			discountMap.put(deleteItem, discountMap.get(deleteItem) - 1);

			String addItem = discount[i - 1 + 10];
			discountMap.put(addItem, discountMap.getOrDefault(addItem, 0) + 1);

			if (isEqual(map, discountMap))
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		DiscountEvent T = new DiscountEvent();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] want = new String[n];
		int[] number = new int[n];
		for (int i = 0; i < n; i++) {
			want[i] = kb.next();
		}
		for (int i = 0; i < n; i++) {
			number[i] = kb.nextInt();
		}

		int d = kb.nextInt();
		String[] discount = new String[d];
		for (int i = 0; i < d; i++) {
			discount[i] = kb.next();
		}
		System.out.println(T.solution(want, number, discount));
	}
}
