package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/** 같은 숫자는 싫어 (스택, 큐)
 * input1
 7
 1 1 3 3 0 1 1
 * output1
 1 3 0 1
 * input2
 5
 4 4 4 3 3
 * output2
 4 3
 */

public class UniqArray {
    // 스택
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int x : arr) {
            if (stack.isEmpty() || stack.peek() != x)
                stack.add(x);
        }
        int[] answer = new int[stack.size()];
        int idx = 0;
        for (int n : stack)
            answer[idx++] = n;
        return answer;
    }

    // 큐
    public int[] solution1(int []arr) {
        LinkedList<Integer> queue = new LinkedList<>();
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                temp=arr[i];
                queue.add(temp);
            }
        }

        int[] answer = new int[queue.size()];
        int idx = 0;
        for (int n : queue)
            answer[idx++] = n;
        return answer;
    }

    public static void main(String[] args) {
        UniqArray T = new UniqArray();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        for (int x : T.solution1(arr))
            System.out.print(x + " ");
    }
}
