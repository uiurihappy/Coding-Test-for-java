package Programmers;

import java.util.Scanner;

/** 가운데 글자 가져오기
 * input1
 abcde
 * output1
 c
 * input2
 qwer
 * output2
 we
 */
public class FetchMiddleString {

    public String solution(String s) {
//        String answer = "";
//        char[] c = s.toCharArray();
//        int idx = s.length() / 2;
//        if (s.length() % 2 == 0) {
//            answer += c[idx - 1];
//            answer += c[idx];
//        } else {
//            answer += c[idx];
//        }
//        return answer;
        return s.substring((s.length()-1)/2, s.length()/2 + 1);
    }

    public static void main(String[] args) {
        FetchMiddleString T = new FetchMiddleString();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
