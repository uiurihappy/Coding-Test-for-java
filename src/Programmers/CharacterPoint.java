package Programmers;

import java.util.Scanner;

/** 캐릭터의 좌표
 * input1
5
left right up right right
11 11
 * output1
 2 1
 * input2
5
down down down down down
7 9
 * output2
 0 -4
 * input4
8
left left left left right right right right
5 5
 * output4
 2 0
 */
public class CharacterPoint {

	// up, down, left, right 순
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	public int[] solution(String[] keyinput, int[] board) {
		int boardX = board[0] / 2;
		int boardY = board[1] / 2;
		int[] answer = {0, 0};

//		System.out.println("boardX = " + boardX);
//		System.out.println("boardY = " + boardY);
		// TODO: 끝값 고려
		for (int i = 0; i < keyinput.length; i++) {
//			System.out.println("keyinput[i] = " + keyinput[i]);
//			if (boardX > Math.abs(answer[0]) && boardY > Math.abs(answer[1])) {
				switch (keyinput[i]) {
					case "right":
						if (answer[0] >= boardX) continue;
						answer[0] += 1;
						break;
					case "left":
						if (answer[0] <= -boardX) continue;
						answer[0] += -1;
						break;
					case "up":
						if (answer[1] >= boardY) continue;
						answer[1] += 1;
						break;
					case "down":
						if (answer[1] <= -boardY) continue;
						answer[1] += -1;
						break;
//				}
			}
//			System.out.println(Math.abs(answer[1]));
//			System.out.println(answer[0] + " " + answer[1]);
		}
		return answer;
	}
	public static void main(String[] args) {
		CharacterPoint T = new CharacterPoint();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] keyinput = new String[n];
		int[] board = new int[2];
		for (int i = 0; i < n; i++)
			keyinput[i] = kb.next();
		for (int i = 0; i < 2; i++)
			board[i] = kb.nextInt();

		for (int x : T.solution(keyinput, board))
			System.out.print(x + " ");
	}
}
