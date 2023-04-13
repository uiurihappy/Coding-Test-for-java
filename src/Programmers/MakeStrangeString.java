package Programmers;

import java.util.*;

/** 이상한 문자 만들기
 * input1
 try hello world
 * output1
 TrY HeLlO WoRlD
 */
public class MakeStrangeString {

    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int cnt = 0;
        for (String ss : str) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeStrangeString T = new MakeStrangeString();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
