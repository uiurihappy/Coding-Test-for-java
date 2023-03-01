package Chapter6;

import java.util.*;

class Problem10 {

    private int solution(int n, int xi, int[] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Problem10 T = new Problem10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int xi = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, xi, arr));
    }


}
