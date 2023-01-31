package Chapter3;

import java.util.Scanner;
/*
** 연속된 자연수의 합
* input
15
* output
3
 */
class Problem5 {

      // solution 1 (two pointers)
//    public int solution (int n) {
//        int answer = 0, sum = 0, lt = 0;
//        // 연속된 자연수 시작점은 n / 2 + 1를 넘길 수 없음
//        int m = n / 2 + 1; // ex) 8 = 15 / 2 + 1
//        // 배열도 그만큼 할당
//        int[] arr = new int[m];
//
//        for (int i = 0; i < m; i++)
//            // 1부터 m까지
//            arr[i] = i + 1;
//
//        for (int rt = 0; rt < m; rt++) {
//            sum += arr[rt];
//            if(sum == n) answer++;
//
//            while (sum >= n) {
//                sum -= arr[lt++];
//                if (sum == n) answer++;
//            }
//        }
//
//        return answer;
//    }

    // solution 2 (수학)
    public int solution (int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
//            System.out.println("n = " + n + ", cnt = " + cnt);
            if (n % cnt == 0) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Problem5 T = new Problem5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
