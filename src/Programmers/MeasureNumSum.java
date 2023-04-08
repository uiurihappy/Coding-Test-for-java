package Programmers;

import java.util.Scanner;

/** 약수의 개수와 덧셈
 * input1
 13 17
 * output1
 43
 * input2
 24 27
 * output2
 52
 */
public class MeasureNumSum {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++){
            int num = 0;

            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    num++;

            answer += num % 2 == 0 ? i : (i * -1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MeasureNumSum T = new MeasureNumSum();
        Scanner kb = new Scanner(System.in);
        int left = kb.nextInt();
        int right = kb.nextInt();
        System.out.println(T.solution(left, right));
    }
}
