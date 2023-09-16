package BucketPlace_1;

import java.util.*;

public class Test2 {

	public int solution(String[] rolls) {
		Stack<Integer> stack = new Stack<>();

		for (String roll : rolls) {
			switch (roll) {
				case "Score":
					// "Score"가 선택된 경우, 임의의 정수를 스택에 추가
					int randomScore = getRandomScore();
					stack.push(randomScore);
					break;
				case "R":
					// "R"이 선택된 경우, 이전 점수를 스택에서 제거
					if (!stack.isEmpty()) {
						stack.pop();
					}
					break;
				case "+":
					// "+"가 선택된 경우, 이전 두 점수의 합을 스택에 추가
					if (stack.size() >= 2) {
						int top = stack.pop();
						int secondTop = stack.pop();
						int newScore = top + secondTop;
						stack.push(secondTop);
						stack.push(top);
						stack.push(newScore);
					}
					break;
				case "D":
					// "D"가 선택된 경우, 이전 점수를 2배로 계산하여 스택에 추가
					if (!stack.isEmpty()) {
						int previousScore = stack.peek();
						int newScore = previousScore * 2;
						stack.push(newScore);
					}
					break;
				default:
					// 숫자 문자열인 경우 Integer로 파싱하여 스택에 추가
					try {
						int number = Integer.parseInt(roll);
						stack.push(number);
					} catch (NumberFormatException e) {
						// 파싱 실패 시 무시
					}
					break;
			}
		}

		// 스택에 남아있는 숫자들의 총합을 계산하여 반환
		int finalScore = 0;
		while (!stack.isEmpty()) {
			finalScore += stack.pop();
		}

		return finalScore;
	}

	// 임의의 정수를 생성하는 메서드
	private int getRandomScore() {
		// 원하는 범위의 난수를 생성하거나, 본문에 맞게 수정할 수 있음
		return (int) (Math.random() * 6) + 1;
	}

	public static void main(String[] args) {

	}
}
