package Chapter8;

import java.util.Scanner;

/** 수열 추측하기
 * input1
 4 16
 * output1
 3 1 2 4
 */
public class Problem8 {

    static int n, f, sum = 0;
    static int[][] dy = new int[35][35];
    static int[] visited, b, p;
    boolean flag = false;

    public int combination(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public void DFS(int L,int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p)
                    System.out.print(x + " ");
                flag = true;
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    visited[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Problem8 T = new Problem8();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();

        b = new int[n];
        p = new int[n];
        visited = new int[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = T.combination(n - 1, i);
//            System.out.print("b[i] = " + b[i] + " ");
        }
//        System.out.println();

        T.DFS(0, 0);
    }
}
