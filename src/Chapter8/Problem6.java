package Chapter8;

import java.io.*;
import java.util.*;

/** 순열 구하기
 * input1
 3 2
 3 6 9
 * output1
 3 6
 3 9
 6 3
 6 9
 9 3
 9 6
 */
public class Problem6 {

    static int n, m;
    static int[] arr, pm, visited;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    visited[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Problem6 T = new Problem6();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
            arr[i] = kb.nextInt();
        }
        visited = new int[n];

        pm = new int[m];


        T.DFS(0);
    }
}
