package Chapter2;

import java.util.Scanner;

class Problem4 {
//      solution 1
    public void solution (int n) {

        int a = 1, b = 1, c;

        System.out.print(a+ " " + b + " ");

        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Problem4 T = new Problem4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }

    // solution 2 (run time error)
//    public int solution (int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return solution(n - 2) + solution(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Problem4 T = new Problem4();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        for(int i = 1; i <= n; i++) System.out.print(T.solution(i) + " ");
//    }
}
