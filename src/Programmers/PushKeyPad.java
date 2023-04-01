package Programmers;

import java.util.Scanner;

/** 키패드 누르기
 * input1
 11
 1 3 4 5 8 2 1 4 5 9 5
 right
 * output1
 LRLLLRLLRRL
 * input2
 11
 7 0 8 2 8 3 1 5 7 6 2
 left
 * output2
 LRLLRRLLLRR
 * input3
 10
 1 2 3 4 5 6 7 8 9 0
 right
 * output3
 LLRLLRLLRL
 */
public class PushKeyPad {
	//        0부터 9까지 좌표 {y,x}
	int[][] numpadPos = {
			{3,1}, //0
			{0,0}, //1
			{0,1}, //2
			{0,2}, //3
			{1,0}, //4
			{1,1}, //5
			{1,2}, //6
			{2,0}, //7
			{2,1}, //8
			{2,2}  //9
	};
	//초기 위치
	int[] leftPos = {3,0};
	int[] rightPos = {3,2};
	String hand;

	//num버튼을 누를 때 어디 손을 사용하는가
	private String pushNumber(int num) {
		if(num==1 || num==4 || num==7) return "L";
		if(num==3 || num==6 || num==9) return "R";

		// 2,5,8,0 일때 어디 손가락이 가까운가
		if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
		if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

		//같으면 손잡이
		return this.hand;
	}

	//해당 위치와 번호 위치의 거리
	private int getDist(int[] pos, int num) {
		return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
	}

	public String solution(int[] numbers, String hand) {
		// sol 1
		String answer = "";
		int left = 10;		// *
		int right = 12;		// #

		for (int number: numbers) {

			switch (number) {
				case 1:
				case 4:
				case 7:
					answer += "L";
					left = number;
					break;
				case 3:
				case 6:
				case 9:
					answer += "R";
					right = number;
					break;
				default:
					// 여기까지는 일반적 case
					// 아래는 2 5 8 0 case
					if (number == 0) number = 11;
					// 거리 계산
					int leftdist = Math.abs(number - left) / 3 + Math.abs(number - left) % 3;
					int rightdist = Math.abs(number - right) / 3 + Math.abs(number - right) % 3;

					if (leftdist < rightdist) {
						answer += "L";
						left = number;
					} else if (leftdist > rightdist) {
						answer += "R";
						right = number;
					} else {
						switch (hand) {
							case "left":
								answer += "L";
								left = number;
								break;
							case "right":
								answer += "R";
								right = number;
								break;
						}
					}
					break;
			}
		}

		// sol 2
//		this.hand = (hand.equals("right")) ? "R" : "L";
//
//		for (int num : numbers) {
//			String Umji = pushNumber(num);
//			answer += Umji;
//
//			if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
//			if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
//		}
		return answer;
	}
	public static void main(String[] args) {
		PushKeyPad T = new PushKeyPad();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] numbers = new int[n];
		String hand = kb.next();
		System.out.println(T.solution(numbers, hand));
	}
}
