package Programmers.Lv2;

import java.util.*;

/** 뒤에 있는 큰 수 찾기
 * input1
 4
 2 3 3 5
 * output1
 3 5 5 -1
 * input2
 6
 9 1 5 3 6 2
 * output2
 -1 5 6 6 -1 -1
 */
public class FindBiggerNum {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        // 모든 index를 탐색 후 뒤에 있는 큰 수가 없는 경우 -1
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindBiggerNum T = new FindBiggerNum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = kb.nextInt();
        for (int x : T.solution(numbers))
            System.out.print(x + " ");
    }
}
