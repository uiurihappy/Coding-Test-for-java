package Programmers;

import java.util.Scanner;

/** 두 정수 사이의 합
 * input1
 3 5
 * output1
 12
 * input2
 3 3
 * output2
 3
 * input3
 5 3
 * output3
 12
 */
public class BetweenNumSum {

    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        if (a == b) return a;
        for (int i = min; i <= max; i++)
            answer+=i;
        return answer;
    }

    public static void main(String[] args) {
        BetweenNumSum T = new BetweenNumSum();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(T.solution(a, b));
    }
}
