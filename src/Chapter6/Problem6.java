package Chapter6;

import java.util.*;

/**
 * 장난꾸러기
 * input
9
120 125 152 130 135 135 143 127 160
 * output
3 8
 */
class Problem6 {

	public ArrayList<Integer> solution (int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] temp = arr.clone();
		Arrays.sort(arr);

		// 정렬된 값과 비교해서 idx+1 를 구한다.
		for (int i = 0; i < n; i++)
			if (temp[i] != arr[i])
				answer.add(i + 1);

		return answer;
	}

	public static void main(String[] args) {
		Problem6 T = new Problem6();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = kb.nextInt();

		for (int x : T.solution(n, arr))
			System.out.print(x + " ");
	}
}
