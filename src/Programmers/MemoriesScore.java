package Programmers;

import java.util.*;

public class MemoriesScore {

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> people = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			people.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			String[] persons = photo[i];
			int score = 0;
			for (int j = 0; j < persons.length; j++) {
				String person = persons[i];
				if (people.containsKey(person)) {
					score += people.get(person);
				}
			}
			answer[i] = score;
		}
		return answer;
	}

	public static void main(String[] args) {
		MemoriesScore T = new MemoriesScore();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] name = new String[n];
		for (int i = 0; i < n; i++)
			name[i] = kb.next();
		int[] yearning = new int[n];
		for (int i = 0; i < n; i++)
			yearning[i] = kb.nextInt();
		int g = kb.nextInt();
		int p = kb.nextInt();
		String[][] photo = new String[g][p];
		for (int i = 0; i < g; i++) {
			for (int j = 0; j < p; j++) {
				photo[i][j] = kb.next();
			}
		}
		for (int x : T.solution(name, yearning, photo)) {
			System.out.print(x + " ");
		}
	}
}
