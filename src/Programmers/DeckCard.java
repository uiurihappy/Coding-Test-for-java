package Programmers;

import java.util.*;

/** 카드 뭉치
 * input1
 3 2
 i drink water
 want to
 i want to drink water
 * output1
Yes
 * input2
 3 2
 i water drink
 want to
 i want to drink water
 * output2
No
 */
public class DeckCard {

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int cardIdx1 = 0;
		int cardIdx1Max = cards1.length;
		int cardIdx2 = 0;
		int cardIdx2Max = cards2.length;

		for (String curStr : goal) {
			if (cardIdx1 < cardIdx1Max && curStr.equals(cards1[cardIdx1])) {
				cardIdx1++;
			} else if (cardIdx2 < cardIdx2Max && curStr.equals(cards2[cardIdx2])) {
				cardIdx2++;
			} else {
				return "No";
			}
		}
		return "Yes";
	}

	public static void main(String[] args) {
		DeckCard T = new DeckCard();
		Scanner kb = new Scanner(System.in);
		int c1 = kb.nextInt();
		int c2 = kb.nextInt();
		String[] cards1 = new String[c1];
		String[] cards2 = new String[c2];
		String[] goal = new String[c1 + c2];
		for (int i = 0; i < c1; i++)
			cards1[i] = kb.next();
		for (int i = 0; i < c2; i++)
			cards2[i] = kb.next();

		for (int i = 0; i < c1 + c2; i++)
			goal[i] = kb.next();
		System.out.println(T.solution(cards1, cards2, goal));
	}
}
