package Chapter6;

import java.util.*;

/**
 * 중복 확인
 * input 1
8
20 25 52 30 39 33 43 33
 * output 1
 D
 * input 1
 8
 20 25 52 30 39 33 43 38
 * output 1
 U
 */
class Problem5 {

	public String solution (int n, int[] arr){
		String answer = "U";

		// first sol o(nlogn)
//		for (int i = 0; i < arr.length; i++) {
//			int temp = arr[i];
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) return 'D';
//				else {
//					continue;
//				}
//			}
//		}

		// stack sol
//		Stack<Integer> stack = new Stack<>();
//
//		for (int x : arr) {
//			if (stack.contains(x)) {
//				answer = "D";
//				break;
//			}else stack.push(x);
//		}

		// HashMap sol
//		HashMap<Integer,Integer> map = new HashMap<>();
//		for(int x : arr){
//			map.put(x,map.getOrDefault(x,0)+1);
//			if(map.get(x) > 1) answer = "D";
//		}

		// Array.sort sol
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++)
			if (arr[i] == arr[i + 1]) return "D";

		return answer;
	}


	public static void main(String[] args) {
		Problem5 T = new Problem5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, arr));

	}
}
