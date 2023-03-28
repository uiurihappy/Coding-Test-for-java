package Programmers;

import java.util.*;

/** 성격 유형 검사하기 (카카오)
 * input1
 5
 AN CF MJ RT NA
 5 3 2 7 5
 * output1
 TCMA
 * input2
 3
 TR RT RT
 7 1 3
 * output2
 RCJA
 */
public class MBTI {

	public String solution(String[] survey, int[] choices) {
		String answer = "";

		// sol 1
//		int rt = 0, cf = 0, jm = 0, an = 0;
//
//		for (int i = 0; i < survey.length; i++) {
//			String sur = survey[i];
//			int score = 0;
//
//			switch (choices[i]) {
//				case 1: score = -3; break;
//				case 2: score = -2; break;
//				case 3: score = -1; break;
//				case 4: score = 0; break;
//				case 5: score = 1; break;
//				case 6: score = 2; break;
//				case 7: score = 3; break;
//			}
//
//			switch (sur) {
//				case "RT":
//					rt += score;
//					break;
//				case "TR" :
//					rt -= score;
//					break;
//				case "CF":
//					cf += score;
//					break;
//				case "FC":
//					cf -= score;
//					break;
//				case "JM":
//					jm += score;
//					break;
//				case "MJ":
//					jm -= score;
//					break;
//				case "AN":
//					an += score;
//					break;
//				case "NA":
//					an -= score;
//					break;
//			}
//		}
//
//		String Tp1 = "R";
//		String Tp2 = "C";
//		String Tp3 = "J";
//		String Tp4 = "A";
//
//		if (rt > 0) Tp1 = "T";
//		if (cf > 0) Tp2= "F";
//		if (jm > 0) Tp3 = "M";
//		if (an > 0) Tp4 = "N";
//		answer = Tp1 + Tp2 + Tp3 + Tp4;

		// sol 2 (Map 활용)

		HashMap<Character, Integer> map = new HashMap<>();
		map.put('R', 0); map.put('T', 0);
		map.put('C', 0); map.put('F', 0);
		map.put('J', 0); map.put('M', 0);
		map.put('A', 0); map.put('N', 0);

		for (int i = 0; i < survey.length; i++) {
			// 4가 보통이니까 기준으로 잡는다.
			if (choices[i] > 4)
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
			else
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);

		}

		// map의 value check
		if (map.get('R') >= map.get('T'))
			answer += "R";
		else
			answer += "T";

		if (map.get('C') >= map.get('F'))
			answer += "C";
		else
			answer += "F";

		if (map.get('J') >= map.get('M'))
			answer += "J";
		else
			answer += "M";

		if (map.get('A') >= map.get('N'))
			answer += "A";
		else
			answer += "N";

		return answer;
	}

	public static void main(String[] args) {
		MBTI T = new MBTI();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] survey = new String[n];
		int[] choices = new int[n];

		for (int i = 0; i < n; i++)
			survey[i] = kb.next();

		for (int i = 0; i < n; i++)
			choices[i] = kb.nextInt();

		System.out.println(T.solution(survey, choices));
	}
}
