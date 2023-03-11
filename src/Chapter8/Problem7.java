package Chapter8;

import java.util.Scanner;

/** 조합의 경우수 (메모이제이션)
 * 공식: nCr = n-1Cr-1 + n-1Cr
 * input1
 5 3
 * output1
 10
 *
 */
public class Problem7 {

    static int n, r;
    static int[][] dy;

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) {
        Problem7 T = new Problem7();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();

        dy = new int[n + 1][r + 1];

        System.out.println(T.DFS(n, r));
    }
}
