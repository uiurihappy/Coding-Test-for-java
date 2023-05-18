package Programmers.Lv2;

import java.util.Scanner;

/** 이진 변환 반복하기
 * input1
 110010101001
 * output1
 3 8
 * input2
 01110
 * output2
 3 3
 * input3
 1111111
 * output3
 4 1
 *
 */
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
        // sol 2
//        int temp;
//        while( !s.equals("1") ) {
//            answer[1] += s.length();
//            s = s.replaceAll("0", "");
//            temp = s.length();
//            s = Integer.toBinaryString(temp);
//            //System.out.println("s : " + s );
//            answer[0]++;
//            answer[1] -= temp;
//        }

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
