package Programmers.Lv2;

import java.util.*;

/** H-index
 * input1
 5
 3 0 6 1 5
 * output1
 3
 */
public class HIndex {

	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		HIndex T = new HIndex();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] citations = new int[n];
		for (int i = 0; i < n; i++)
			citations[i] = kb.nextInt();
		System.out.println(T.solution(citations));
	}
}
