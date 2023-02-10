package Programmers;

import java.util.*;

class PrivaciesTerms {

	public int[] solution(String today, String[] terms, String[] privacies) {

		String today2 = today.replace(".", "");
		int year = Integer.parseInt(today2.substring(0, 4));
		int month = Integer.parseInt(today2.substring(4, 6));
		int day = Integer.parseInt(today2.substring(6, 8));

		int cnt = (year * 12 * 28) + (month * 28) + day;
		int[] answer = new int[privacies.length];

		for (int i = 0; i < privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");

			// 약관 달 구하기
			int num = 0;

			for (int j = 0; j < terms.length; j++) {
				String[] term = terms[j].split(" ");
				if (privacy[1].equals(term[0])) {
					num = Integer.parseInt(term[1], 10);
					break;
				}
			}

			String[] privacyDate = privacy[0].split("\\.");
			int pyear = Integer.parseInt(privacyDate[0]);
			int pmonth = Integer.parseInt(privacyDate[1]);
			int pday = Integer.parseInt(privacyDate[2]);

			pmonth += num;

			int tcnt = (pyear * 12 * 28) + (pmonth * 28) + pday - 1;

			if (cnt > tcnt) {
				answer[i] = i + 1;
			}

		}


		int a = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > 0) a++;
		}

		int[] arr = new int[a];

		int idx = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > 0) {
				arr[idx] = answer[i];
				idx++;
			}
		}


		return arr;
	}

	public static void main(String[] args) {
		PrivaciesTerms T = new PrivaciesTerms();
		Scanner kb = new Scanner(System.in);
		String today = kb.next();
		String[] terms;
		String[] privacies;

//		System.out.println(T.solution(today, terms, privacies));
//		for (int x : T.solution(today, terms, privacies)) {
//			System.out.println(x + " ");
//		}

	}

}
