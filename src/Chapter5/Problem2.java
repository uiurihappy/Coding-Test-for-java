package Chapter5;

import java.util.*;
/*
** 괄호문자제거
* input
(A(BC)D)EF(G(H)(IJ)K)LM(N)
* output
EFLM
 */
class Problem2 {

	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		// solution 1
//		for (char x : str.toCharArray()) {
//			// push: stack에 할당
//			if (x == '(') {
//				stack.push(x);
//				cnt++;
//			} else if (x == ')') {
//				stack.pop();
//				cnt--;
//			} else {
//				if(cnt <= 0) answer += x;
//			}
//		}
		// solution 2
//		for (char x : str.toCharArray()) {
//			if (x == '(') stack.push(x);
//			else if (x == ')') stack.pop();
//			else if (stack.isEmpty()) answer += x;
//		}

		// solution 3
		for (char x : str.toCharArray()) {
			if (x == ')') {
				while (stack.pop() != '(');
			} else
				stack.push(x);
		}
		for (int i = 0; i < stack.size(); i++)
			answer += stack.get(i);

		return answer;
	}

	public static void main(String[] args) {
		Problem2 T = new Problem2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
