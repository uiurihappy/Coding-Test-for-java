package ArrayProblem;

import java.util.Scanner;

class Problem2 {

    public Integer solution (int n, int[] arr) {
        Integer answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    };

    public static void main(String[] args) {
        Problem2 T = new Problem2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
