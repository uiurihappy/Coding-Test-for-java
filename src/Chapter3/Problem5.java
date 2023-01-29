package Chapter3;

import java.util.Scanner;

class Problem5 {

    public int solution (int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int m = 0;
            while (m <= n) {
                if (m == n)
                    answer++;
                m += i;
            }
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
