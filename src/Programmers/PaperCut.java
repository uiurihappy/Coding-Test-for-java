package Programmers;

import java.util.Scanner;

public class PaperCut {

    public int solution (int M, int N) {
        return M * N -1;
    }

    public static void main(String[] args) {
        PaperCut T = new PaperCut();
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();

        System.out.println(T.solution(m,n));
    }
}
