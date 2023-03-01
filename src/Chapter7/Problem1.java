package Chapter7;

import java.util.*;

/**
 * 재귀함수
 * input
 3
 * output
 1 2 3
 */
class Problem1 {

    public void solution(int n) {
        if (n == 0) return;
        else {
            solution(n - 1);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Problem1 T = new Problem1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        T.solution(n);
    }

}
