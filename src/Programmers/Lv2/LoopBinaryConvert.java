package Programmers.Lv2;

import java.util.Scanner;

public class LoopBinaryConvert {

    public int[] solution(String s) {
        int[] answer = new int[2];
        String temp = "";
        int cnt = 0;

        while (s.length() != 1) {
            for (String x : s.split("")) {
                if (x.equals("0")) {
                    answer[1]++;
                } else {
                    temp += "1";
                }
                s = Integer.toBinaryString(temp.length());
            }
            temp = "";
            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        LoopBinaryConvert T = new LoopBinaryConvert();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        for (int x : T.solution(s))
            System.out.print(x + " ");
    }
}
