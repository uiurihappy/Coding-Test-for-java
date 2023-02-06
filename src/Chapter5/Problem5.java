package Chapter5;

import java.util.*;
/*
** 쇠막대기
* input 1
()(((()())(())()))(())
* output 1
17

* input 2
(((()(()()))(())()))(()())
* output 2
24
 */
class Problem5 {

    // 여는 괄호, 닫는 괄호는 거의 stack 문제이다.
    public int solution (String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // 여는 괄호는 stack에 push
            if (str.charAt(i) == '(') stack.push('(');
            // 닫는 괄호를 만났을 때, 레이저의 쌍으로서 닫는 괄호인지,
            // 막대기인지, 막대기의 끝을 알려주는 괄호인지 판별해야 함
            /*
            1. 바로 앞인 것이 여는 괄호면 레이저
            - stack의 최상단 원소를 pop 시킨다.
            2. 아니면 막대기
            - pop 시키고 남은 stack의 원소 길이는 막대기 길이다. (answer에 막대기 갯수를 누적)
            3. 닫는 괄호 다음에 여는 괄호면, stack 길이를 또 누적
             */
            else {
                // 닫는 괄호 pop
                stack.pop();
                // 바로 앞 지점이 여는 괄호면 레이저로 판단
                if (str.charAt(i - 1) == '(')
                    answer += stack.size();
                // 레이저가 아니라 막대기의 끝일 때
                else
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem5 T = new Problem5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
