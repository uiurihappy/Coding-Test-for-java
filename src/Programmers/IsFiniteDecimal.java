package Programmers;

import java.util.Scanner;

/** 유한소수 판별
 * input1
 7 20
 * output1
 1
 * input2
 11 22
 * output2
 1
 * input3
 12 21
 * output3
 2
 */
public class IsFiniteDecimal {

    public int solution(int a, int b) {
        int g = 1;
        for (int i = 1; i <= b; i++)
            if (a % i == 0 && b % i == 0)
                g = i;
        int tempB = b / g;
        while (tempB % 2 == 0) tempB /= 2;
        while (tempB % 5 == 0) tempB /= 5;

        return tempB == 1 ? 1 : 2;
    }
    public static void main(String[] args) {
        IsFiniteDecimal T = new IsFiniteDecimal();
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt();

        System.out.println(T.solution(a, b));
    }
}
