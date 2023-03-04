package Chapter2;

import java.util.*;

/** 큰 수 출력하기 (자신의 바로 앞 수보다 큰 수만 출력)
 * input
 6
 7 3 9 5 6 12
 * output
 7 9 6 12
 */
class Problem1 {

    public ArrayList<Integer> solution (int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem1 T = new Problem1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        for (int x : T.solution(n, arr))
            System.out.print(x + " ");

    }
}
