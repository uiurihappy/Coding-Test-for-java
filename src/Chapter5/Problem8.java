package Chapter5;

import java.util.*;
/*
** 응급실
* input 1
5 2
60 50 70 80 90
* output 1
3
* input 2
6 3
70 60 90 60 60 60
* output 2
4
 */
class Person {
	// 0번째부터 n번째 순서 목록
	int id;
	// 위험도
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
		int answer = 0;
		// Person 형 queue
		Queue<Person> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) queue.offer(new Person(i, arr[i]));

		while (!queue.isEmpty()) {
			Person temp = queue.poll();
			for (Person x : queue) {
//				System.out.println(temp.getPriority() + " " + x.getPriority());
				if (x.priority > temp.priority) {
					queue.offer(temp);
					temp = null;
					break;
				}
			}
			if (temp != null) {
				answer++;
				if (temp.id == m) return answer;
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
