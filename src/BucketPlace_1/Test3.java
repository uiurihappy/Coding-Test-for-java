package BucketPlace_1;

import java.util.Stack;

public class Test3 {

	public boolean solution(String s) {
		// 스택을 사용하여 괄호 짝을 확인
		Stack<Character> stack = new Stack<>();

		// 주어진 문자열을 순회하면서 괄호를 확인
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				// 여는 괄호를 만나면 스택에 푸시
				stack.push(c);
			} else {
				// 닫는 괄호를 만나면 스택에서 팝하고 짝이 맞는지 확인
				if (stack.isEmpty()) {
					return false; // 스택이 비어있으면 짝이 없는 닫는 괄호가 있다는 뜻
				}

				char top = stack.pop(); // 스택에서 꺼낸 여는 괄호
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false; // 괄호 짝이 맞지 않음
				}
			}
		}

		// 문자열을 모두 탐색한 후에도 스택에 여는 괄호가 남아있으면 유효하지 않음
		return stack.isEmpty();
	}


	public static void main(String[] args) {

	}
}
