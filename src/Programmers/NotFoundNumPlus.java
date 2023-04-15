package Programmers;

import java.util.Arrays;
import java.util.Scanner;

/** 없는 숫자 더하기
 * input1
 8
 1 2 3 4 6 7 8 0
 * output1
 14
 * input2
 7
 5 8 4 0 6 7 9
 * output2
 6
 */
public class NotFoundNumPlus {

    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++)
            answer -= numbers[i];

        return answer;
//        return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        NotFoundNumPlus T = new NotFoundNumPlus();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = kb.nextInt();

        System.out.println(T.solution(numbers));
    }
}
