package Chapter5;

import java.util.*;

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
class Problem8 {

	public int solution (int n, int m, int[] arr) {
		int answer = 1;
		Queue<Person> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) queue.add(new Person(i, arr[i]));

		while (!queue.isEmpty()) {
			Person temp = queue.poll();
			for (Person x : queue) {
				if (x.priority > temp.priority) {
					queue.add(temp);
					temp = null;
					break;
				}
			}
			if (temp != null) {
				if (temp.id == m) return answer;
				else answer++;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		Problem8 T = new Problem8();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, m, arr));
	}
}
