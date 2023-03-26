package Programmers;

import java.util.Scanner;

/** 삼총사
 * input1
 5
 -2 3 0 2 -5
 * output1
 2
 * input2
 7
 -3 -2 -1 0 1 2 3
 * output2
 5
 * input3
 4
 -1 1 -1 1
 * output3
 0
 */
public class ThreeMusketeers {

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++)
            for (int j = i + 1; j < number.length; j++)
                for (int k = j + 1; k < number.length; k++)
                    if (number[i] + number[j] + number[k] == 0)
                        answer++;

        return answer;
    }

    public static void main(String[] args) {
        ThreeMusketeers T = new ThreeMusketeers();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++)
            number[i] = kb.nextInt();

        System.out.println(T.solution(number));
    }
}
