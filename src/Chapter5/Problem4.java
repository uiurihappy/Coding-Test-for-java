package Chapter5;

import java.util.*;
/*
** 후위식 연산 (postfix)
* input
352+*9-
* output
12
 */
class Problem4 {

    public int solution (String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
//                if (x == '+') stack.push(lt + rt);
//                else if (x == '*') stack.push(lt * rt);
//                else if (x == '/') stack.push(lt / rt);
//                else if (x == '-') stack.push(lt - rt);

                switch (x) {
                    case '+' -> stack.push(lt + rt);
                    case '*' -> stack.push(lt * rt);
                    case '/' -> stack.push(lt / rt);
                    case '-' -> stack.push(lt - rt);
                    default -> {
                    }
                }

            }
        }
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Problem4 T = new Problem4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
