package Chapter5;

import java.util.*;
/*
** 올바른 괄호

* input 1
(()(()))(()
* output 2
NO
* input 2
(()(()))()
* output 2
YES

 */
class Problem1 {

	public String solution(String str) {
		String answer = "YES";
		// stack 구조는 구덩이처럼 LIFO 구조이다.
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			// push: stack에 할당
			if (x == '(') stack.push(x);
			else {
				if (stack.isEmpty()) return "NO";
				// pop: stack에서 최근에 넣었던 원소를 꺼낸다.
				stack.pop();
			}
		}
		if (!stack.isEmpty()) return "NO";

		return answer;
	}

	public static void main(String[] args) {
		Problem1 T = new Problem1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
