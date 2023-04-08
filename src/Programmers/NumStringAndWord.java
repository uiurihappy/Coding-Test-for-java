package Programmers;

import java.util.Scanner;

/** 숫자 문자열과 영단어
 * input1
 one4seveneight
 * output1
 1478
 * input2
 23four5six7
 * output2
 234567
 * input3
 2three45sixseven
 * output3
 234567
 * input4
 123
 * output4
 123
 */
public class NumStringAndWord {

    public int solution(String s) {
        String answer = "";
        String num = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
            else num += x;

            switch (num) {
                case "zero":
                    answer += "0";
                    num = "";
                    break;
                case "one":
                    answer += "1";
                    num = "";
                    break;
                case "two":
                    answer += "2";
                    num = "";
                    break;
                case "three":
                    answer += "3";
                    num = "";
                    break;
                case "four":
                    answer += "4";
                    num = "";
                    break;
                case "five":
                    answer += "5";
                    num = "";
                    break;
                case "six":
                    answer += "6";
                    num = "";
                    break;
                case "seven":
                    answer += "7";
                    num = "";
                    break;
                case "eight":
                    answer += "8";
                    num = "";
                    break;
                case "nine":
                    answer += "9";
                    num = "";
                    break;
            }
        }

        // sol 2
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        NumStringAndWord T = new NumStringAndWord();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
