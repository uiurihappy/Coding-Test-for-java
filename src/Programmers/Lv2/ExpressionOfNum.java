package Programmers.Lv2;

import java.util.Scanner;

public class ExpressionOfNum {
    public int solution(int n) {
        int answer = 0;

        // sol 2
//        for (int i = 1; i <= n; i += 2)
//            if (n % i == 0)
//                answer++;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ExpressionOfNum T = new ExpressionOfNum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
