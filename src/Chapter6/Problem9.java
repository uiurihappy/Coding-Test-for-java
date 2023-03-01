package Chapter6;

import java.util.*;

/**
 * 뮤직비디오 (결정 알고리즘)
 * input
 9 3
 1 2 3 4 5 6 7 8 9
 * output
 17
 */
class Problem9 {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;   // cnt는 DVD장 수, sum은 DVD 곡들의 합

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2; // (9 + 45) / 2 = 27

            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem9 T = new Problem9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }


}
