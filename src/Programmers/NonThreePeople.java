package Programmers;

import java.util.Scanner;

/** 저주의 숫자 3 (이딴 마을이 어딨어..)
 * input1
 15
 * output1
 25
 * input2
 40
 * output2
 76
 */
public class NonThreePeople {

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3"))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        NonThreePeople T = new NonThreePeople();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
