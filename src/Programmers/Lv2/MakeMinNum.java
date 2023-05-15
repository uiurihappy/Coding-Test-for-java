package Programmers.Lv2;

import java.util.*;

/** 최소값 만들기
 * input1
 3
 1 4 2
 5 4 4
 * output1
 29
 * input2
 2
 1 2
 3 4
 * output2
 16
 */
public class MakeMinNum {

    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer = answer + (A[i] * B[A.length - i - 1]);
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeMinNum T = new MakeMinNum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = kb.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr2[i] = kb.nextInt();
        System.out.println(T.solution(arr1, arr2));
    }
}
