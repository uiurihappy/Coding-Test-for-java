package BucketPlace_1;

import java.util.*;

/**
 * Problem
 * 여는 괄호 '('와 닫는 괄호 ')'로만 이루어진 문자열이 있다.
 * 이 문자열의 괄호 쌍이 올바르게 짝지어지도록 괄호를 임의로 추가한다면, 최소 몇개를 추가하면 되겠는가?
 * Examples
 *
 * Example 1:
 * Input: s = "())"
 * Output: 1
 *
 * Example 2:
 * Input: s = "((("
 * Output: 3
 *
 * Input: s = "))(("
 * output: 4
 *
 * Input: s = "))(())"
 * output: 2
 */
public class Live_Test {

	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack1 = new Stack<>(); // 루프를 진행할 스택

		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack1.push(c);

			} else {
				if (stack1.isEmpty()) {
					answer++;
				} else {
					stack1.pop();
				}
			}
		}
		return answer + stack1.size();
	}

	public static void main(String[] args) {

		Live_Test T = new Live_Test();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
