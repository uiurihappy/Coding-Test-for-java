package EK;

import java.util.Scanner;

/*
input1
7
2 3 4 -1 -6 -11 1
output1
4

9
1 2 3 4 -1 -6 -11 -16 1

input2
5
0 0 0 0 0
output2
5

 */
public class EK_Test1 {

    public int solution(long[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE, cnt = 1;
        int k = (int) Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int temp  = (int) Math.abs(arr[i] - arr[i - 1]);
//            System.out.println("temp = " + temp + " cnt = " + cnt + " k = " + k);
//            if (temp != k) {
//                cnt = 0;
//            };
            if (temp == k) cnt++;
            else {
                cnt = 2;
                k = temp;
            }
//            temp = 0;
            answer = Math.max(answer, cnt);
//            System.out.println(answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        EK_Test1 T = new EK_Test1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        System.out.println("answer = " + T.solution(arr));
    }
}
