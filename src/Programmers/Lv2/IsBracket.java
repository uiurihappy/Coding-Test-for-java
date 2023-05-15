package Programmers.Lv2;

import java.util.*;

public class IsBracket {

    boolean solution(String s) {
        boolean answer = true;
        // stack 구조는 구덩이처럼 LIFO 구조이다.
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            // push: stack에 할당
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return false;
                // pop: stack에서 최근에 넣었던 원소를 꺼낸다.
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;

        return answer;
    }

    public static void main(String[] args) {
        IsBracket T = new IsBracket();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
