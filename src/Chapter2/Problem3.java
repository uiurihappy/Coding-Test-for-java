package Chapter2;

import java.util.Scanner;

/** 가위바위보
 * input:
    5
    2 3 3 1 3
    1 1 2 2 3
 * output:
    A
    B
    A
    B
    D
 */
/*
    이기는 승자 출력, 비기면 "D" 출력
 */
class Problem3 {

    public String solution (int n, int arrA, int arrB) {
        // 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
        String winner = "A";

        if (arrA == 1 && arrB == 2) {
            return "B";
        } else if (arrA == 3 && arrB == 1) {
            return "B";
        } else if (arrA == 2 && arrB == 3) {
            return "B";
        } else if (arrA == arrB) {
            return "D";
        }

        return winner;
    }

    public static void main(String[] args) {
        Problem3 T = new Problem3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++)
            arrA[i] = kb.nextInt();

        for (int i = 0; i < n; i++)
            arrB[i] = kb.nextInt();

        for (int i = 0; i < n; i++)
            System.out.println(T.solution(n, arrA[i], arrB[i]));

    }
}
