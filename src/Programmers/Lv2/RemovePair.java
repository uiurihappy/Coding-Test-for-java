package Programmers.Lv2;

import java.util.*;

/** 짝지어 제거하기
 * input1
 baabaa
 * output1
 1
 * input2
 cdcd
 * output2
 0
 */
public class RemovePair {

    public int solution(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char temp : c) {
            if (stack.isEmpty()) stack.push(temp);
            else {
                if (stack.peek() == temp) {
                    stack.pop();
                } else {
                    stack.push(temp);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        RemovePair T = new RemovePair();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
