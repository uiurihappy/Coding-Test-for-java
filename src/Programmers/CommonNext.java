package Programmers;

import java.util.Scanner;

/** 다음에 올 숫자
 * input1
 4
 1 2 3 4
 * output1
 5
 * input2
 3
 2 4 8
 * output2
 16
 *
 */
public class CommonNext {

    static int n;
    static int[] common;
    public int solution (int[] common) {
        int answer = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }

    public static void main(String[] args) {
        CommonNext T = new CommonNext();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        common = new int[n];

        for (int i = 0; i < n; i++)
            common[i] = kb.nextInt();

        System.out.println(T.solution(common));

    }
}
