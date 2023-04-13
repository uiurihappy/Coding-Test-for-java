package Programmers;

import java.util.ArrayList;
import java.util.Scanner;

/** 최대공약수랑 최소공배수
 * input1
 3 12
 * output1
 3 12
 * input2
 2 5
 * output2
 1 10
 */
public class GreatestLeast {

    public int[] solution(int n, int m) {
        int[] arr = new int[2];

        for (int i = 1; i <= n + m; i++) {
            if (m % i == 0 && n % i == 0) {
                arr[0] = i;
                arr[1] = (n * m) / arr[0];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        GreatestLeast T = new GreatestLeast();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        for (int x : T.solution(n, m))
            System.out.print(x + " ");
    }
}
