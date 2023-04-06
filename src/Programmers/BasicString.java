package Programmers;

import java.util.Scanner;

/** 문자열 다루기 기본
 * input1
 1234
 * output1
 true
 * input2
 a123
 * output2
 false
 */
public class BasicString {

    public boolean solution(String s) {
        boolean answer = true;
        // sol 1
//        if (s.length() == 4 || s.length() == 6) {
//            for (char x : s.toCharArray())
//                if (!Character.isDigit(x))
//                    return false;
//        } else return false;

        // sol 2
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
        return answer;
    }

    public static void main(String[] args) {
        BasicString T = new BasicString();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
