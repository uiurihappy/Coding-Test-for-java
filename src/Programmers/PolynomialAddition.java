package Programmers;

import java.util.Scanner;

/** 다항식 구하기
 * input1
 3x + 7 + x
 * output1
 4x + 7
 * input2
 x + x + x
 * output2
 3x
 */
public class PolynomialAddition {

    public String solution(String polynomial) {
        String answer = "";

        int coef = 0;   // 계수
        int cons = 0;   // 상수

        for (String x : polynomial.split(" ")) {
            if (x.contains("x"))
                coef += x.equals("x") ? 1 : Integer.parseInt(x.substring(0, x.length() - 1));
            else if (!x.equals("+"))
                cons += Integer.parseInt(x);
        }
//        System.out.println("coef = " + coef);
//        System.out.println("cons = " + cons);
        String coefStr = coef > 0 ? coef == 1 ? "x" : coef + "x" : "";
        String consStr = cons > 0 ? String.valueOf(cons) : "";

//        System.out.println("coefStr = " + coefStr);
//        System.out.println("consStr = " + consStr);

        if (coef > 0) {
            if (cons > 0)
                answer += coefStr + " + " + consStr;
            else answer += coefStr;
        } else if (cons > 0) {
            answer += consStr;
        }

        return answer;
    }
    public static void main(String[] args) {
        PolynomialAddition T = new PolynomialAddition();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
