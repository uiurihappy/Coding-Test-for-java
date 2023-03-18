package Programmers;

import java.util.Scanner;

public class OX_Quiz {

    static String[] quiz;

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        OX_Quiz T = new OX_Quiz();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for (int i = 0; i < n; i++)
            quiz[i] = kb.next();

        for (String answer : T.solution(quiz))
            System.out.print(answer + " ");

    }
}
