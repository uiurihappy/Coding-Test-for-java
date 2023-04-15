package Programmers;

import java.util.Scanner;

/** x만큼 간격이 있는 n개의 숫자
 * input1
 4 3
 * output1
 4 8 12
 * input2
 2 5
 * output2
 2 4 6 8 10
 * input3
 -4 2
 * output3
 -4 -8
 */
public class RangeByXNum {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++)
            answer[i - 1] = (long) x * i;

        return answer;
        // sol 2
//         return LongStream.iterate(x, i->i+x).limit(n).toArray();
    }

    public static void main(String[] args) {
        RangeByXNum T = new RangeByXNum();
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int n = kb.nextInt();
        for (long a : T.solution(x, n))
            System.out.print(a + " ");
    }
}
