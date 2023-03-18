package Programmers;

import java.util.Scanner;

/** 분수의 덧셈
 * 1 / 2 + 3 / 4 = 5 / 4
 * input1
 1 2 3 4
 * output1
 5 4
 * input2
 9 2 1 3
 * output2
 29 6
 */
public class SumNumerDenom {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        answer[0] = (numer1 * denom2) + (denom1 * numer2);
        answer[1] = denom1 * denom2;

        for (int i = answer[0] - 1; i > 1; i--) {
            // 기약 분수로 만들기
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SumNumerDenom T = new SumNumerDenom();
        Scanner kb = new Scanner(System.in);
        int numer1, denom1, numer2, denom2;

        numer1 = kb.nextInt();
        denom1 = kb.nextInt();
        numer2 = kb.nextInt();
        denom2 = kb.nextInt();

        for (int x : T.solution(numer1, denom1, numer2, denom2))
            System.out.print(x + " ");
    }
}
