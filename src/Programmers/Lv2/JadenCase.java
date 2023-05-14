package Programmers.Lv2;

import java.util.Scanner;

public class JadenCase {

    public String solution(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");

        boolean flag = true;

        for (String word : words) {
            answer += flag ? word.toUpperCase() : word;
            flag = word.equals(" ");
        }

        return answer;
    }

    public static void main(String[] args) {
        JadenCase T = new JadenCase();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
