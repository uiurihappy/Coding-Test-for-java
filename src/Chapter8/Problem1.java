package Chapter8;

import java.io.*;
import java.util.*;

/** 부분 집합
 * 부분 집합이란?
 * 집합 B의 원소가 모두 집합 A의 원소가 되어 있을 때의 집합 A를 집합 B의 부분 집합이라 말한다.
 * input1
 6
 1 3 5 6 7 10
 * output1
 YES
 */
public class Problem1 {

    static int n;
    static int[] arr;
    static int total = 0;
    boolean flag = false;
    static String answer = "NO";

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > (total / 2)) return;

        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        Problem1 T = new Problem1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);

    }


}
