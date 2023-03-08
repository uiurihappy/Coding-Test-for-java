package Chapter8;

import java.io.*;
import java.util.*;

/** 바둑이 승차 (DFS)
 * input1
259 5
81
58
42
33
61
 * output1
 242
 */
public class Problem2 {

    static int n;
    static int c;
    static int answer = Integer.MIN_VALUE;
    static int[] arr;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }

    }

    public static void main(String[] args) throws IOException{
        Problem2 T = new Problem2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
