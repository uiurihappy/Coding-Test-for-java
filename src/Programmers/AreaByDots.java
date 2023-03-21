package Programmers;

import java.util.Scanner;

/** 직사각형 넓이 구하기
 * input1
 1 1
 2 1
 2 2
 1 2
 * output1
 1
 * input2
 -1 -1
 1 1
 1 -1
 -1 1
 * output2
 4
 */
public class AreaByDots {

    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0, y = 0;
        for (int i = 1; i < 4; i++) {
            if ((dots[0][0] != dots[i][0]) && (dots[0][1] != dots[i][1])) {
                x = dots[i][0];
                y = dots[i][1];
                break;
            }
        }

        return (int) Math.sqrt((int)(Math.pow(dots[0][0] - x, 2))) * (int) Math.sqrt((int)(Math.pow(dots[0][1] - y, 2)));
    }

    public static void main(String[] args) {
        AreaByDots T = new AreaByDots();
        Scanner kb = new Scanner(System.in);
        int[][] dots = new int[4][2];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 2; j++)
                dots[i][j] = kb.nextInt();

        System.out.println(T.solution(dots));
    }
}
