package Programmers;

import java.util.Arrays;
import java.util.Scanner;

/** 수박수박수박수박수박수?
 * input1
 3
 * output1
 수박수
 * input2
 4
 * output2
 수박수박
 */
public class WaterMelon {

    public String solution(int n) {
        String answer = "";
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0)
//                answer += "박";
//            else answer += "수";
//        }
//        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
        for (int i = 0; i < n; i++)
            answer += (i%2 == 0) ? "수" : "박";
        return answer;
    }

    public static void main(String[] args) {
        WaterMelon T = new WaterMelon();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
