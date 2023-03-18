package Programmers;

import java.util.Scanner;

/** 연속된 숫자 합
 * 등차수열의 합 공식을 응용하여 풀이
 * input1
 3 12
 * output1
 3 4 5
 * input2
 5 15
 * output2
 1 2 3 4 5
 */
public class Consecutive {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int nSum = num * (num + 1) / 2;
        int start = (total - nSum) / num + 1;

        for (int i = 0; i <= num; i++)
            answer[i - 1] = i + start;

        return answer;
    }
    static int num, total;
    public static void main(String[] args) {
        Consecutive T = new Consecutive();
        Scanner kb = new Scanner(System.in);
        num = kb.nextInt();
        total = kb.nextInt();

        for (int x : T.solution(num, total))
            System.out.print(x + " ");
    }
}
