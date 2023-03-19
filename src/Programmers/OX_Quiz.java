package Programmers;

import java.util.Scanner;

/** OX퀴즈
 * input1
3 - 4 = -3
5 + 6 = 11
 * output1
 X O
 * input2
 19 - 6 = 13
 5 + 66 = 71
 5 - 15 = 63
 3 - 1 = 2
 * output2
 O O X O
 */
public class OX_Quiz {

    static String[] quiz;

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];


        for (int i = 0; i < quiz.length; i++) {
            String[] splitStr = quiz[i].split(" ");
            int result =
                    Integer.parseInt(splitStr[0]) +
                            (Integer.parseInt(splitStr[2]) * (splitStr[1].equals("-") ? -1 : 1));
            answer[i] = Integer.parseInt(splitStr[4]) == result ? "O" : "X";
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
