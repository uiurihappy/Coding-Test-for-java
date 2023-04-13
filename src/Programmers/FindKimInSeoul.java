package Programmers;

import java.util.Arrays;
import java.util.Scanner;

/** 서울에서 김서방 찾기
 * input1
 2
 Jane Kim
 * output1
 김서방은 1에 있다.
 */
public class FindKimInSeoul {
    public String solution(String[] seoul) {
//        int answer = 0;
//        for (int i = 0; i < seoul.length; i++)
//            if (seoul[i].equals("Kim")) {
//                answer = i;
//                break;
//            }


        return "김서방은 %s에 있다".formatted(Arrays.asList(seoul).indexOf("Kim"));
//        return "김서방은 " + answer + "에 있다";
    }

    public static void main(String[] args) {
        FindKimInSeoul T = new FindKimInSeoul();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] seoul = new String[n];
        for (int i = 0; i < n; i++)
            seoul[i] = kb.next();
        System.out.println(T.solution(seoul));
    }
}
