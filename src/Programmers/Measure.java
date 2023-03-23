package Programmers;

import java.util.Scanner;

public class Measure {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                answer += i;

        return answer;
    }

    public static void main(String[] args) {
        Measure T = new Measure();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
