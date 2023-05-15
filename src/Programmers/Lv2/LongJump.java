package Programmers.Lv2;

import java.util.Scanner;

/** 멀리 뛰기
 * input1
 4
 * output1
 5
 * input2
 3
 * output2
 3
 */
public class LongJump {

    public long solution(int n) {
        if (n == 1) return 1;
        long []dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] += (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        LongJump T = new LongJump();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
