package Programmers;

import java.util.*;

/** 최빈값
 * input1
 6
 1 2 3 3 3 4
 * output1
 3
 * input2
 4
 1 1 2 2
 * output2
 -1
 * input3
 1
 1
 * output3
 1
 */
public class Mode {

    static int n;
    static int[] arr;

    public int solution(int[] array) {
        Map<Integer, Integer> modeMap = new HashMap<>();

        int answer = Integer.MIN_VALUE, maxCount = 0;

        for (int x : array) {
            int count = modeMap.getOrDefault(x, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = x;
            }
            else if (count == maxCount)
                answer = -1;

            modeMap.put(x, count);
        }

        return answer;
    }

    public static void main(String[] args) {
        Mode T = new Mode();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(arr));
    }
}
