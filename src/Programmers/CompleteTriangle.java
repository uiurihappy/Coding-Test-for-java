package Programmers;

import java.util.Scanner;

/** 삼각형의 완성조건(2)
 * input1
 1 2
 * output1
 * 1
 * input2
 3 6
 * output2
 * 5
 * input3
 11 7
 * output3
 * 13
 */
public class CompleteTriangle {

    public int solution(int[] sides) {
        int answer = 0;
        int longLen = Math.max(sides[0], sides[1]);
        int shortLen = Math.min(sides[0], sides[1]);
        for (int i = longLen - shortLen + 1; i <= longLen; i++)
            answer++;
//        System.out.println("answer = " + answer);
        for (int i = longLen + 1; i < (longLen + shortLen); i++)
            answer++;
        return answer;
    }

    public static void main(String[] args) {
        CompleteTriangle T = new CompleteTriangle();
        Scanner kb = new Scanner(System.in);
        int[] sides = new int[2];

        for (int i = 0; i < 2; i++)
            sides[i] = kb.nextInt();

        System.out.println(T.solution(sides));
    }
}
