package Chapter8;

import java.util.Scanner;

/** 조합 구하기
 * input1
 4 2
 * output1
 1 2
 1 3
 1 4
 2 3
 2 4
 3 4
 */
public class Problem9 {

    static int n, m, sum = 0;
    static int[] pm;

    public void DFS(int L, int sum) {
        if (L == m) {
            for (int x : pm)
                System.out.print(x + " ");

            System.out.println();
        } else {
            for (int i = sum; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Problem9 T = new Problem9();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];

        T.DFS(0, 1);

    }
}
