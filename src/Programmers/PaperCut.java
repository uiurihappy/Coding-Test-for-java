package Programmers;

import java.util.Scanner;

/** 종이 자르기
 * input1
 2 2
 * output1
 3
 * input2
 2 5
 * output2
 9
 * input3
 1 1
 * output3
 0
 */
public class PaperCut {

    public int solution (int M, int N) {
        return M * N -1;
    }

    public static void main(String[] args) {
        PaperCut T = new PaperCut();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();

        System.out.println(T.solution(m,n));
    }
}
