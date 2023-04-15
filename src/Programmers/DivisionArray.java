package Programmers;

import java.util.*;

/** 나누어 떨어지는 숫자 배열
 * input1
 4
 5 9 7 10
 5
 * output1
 5 10
 * input2
 4
 2 36 1 3
 1
 * output2
 1 2 3 36
 * input3
 3
 3 2 6
 10
 * output3
 -1
 */
public class DivisionArray {

    public int[] solution(int[] arr, int divisor) {

        int[] answer = Arrays.stream(arr).filter(item -> item % divisor == 0).sorted().toArray();
        return answer.length < 1 ? new int[]{-1} : answer;
    }

    public static void main(String[] args) {
        DivisionArray T = new DivisionArray();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        int divisor = kb.nextInt();

        for (int x : T.solution(arr, divisor))
            System.out.print(x + " ");

    }
}
