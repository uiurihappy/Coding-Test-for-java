package Programmers.Lv2;

import java.util.*;

/** 전화번호 목록
 * input1
 3
 119 97674223 1195524421
 * output1
 false
 * input2
 3
 123 456 789
 * output2
 true
 * input3
 5
 12 123 1235 567 88
 * output3
 false
 */
public class PhoneBook {

	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++)
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;

		return answer;
	}

	public static void main(String[] args) {
		PhoneBook T = new PhoneBook();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String[] phone_book = new String[n];

		for (int i = 0; i < n; i++)
			phone_book[i] = kb.next();

		System.out.println(T.solution(phone_book));
	}
}
