package Chapter3;

import java.util.Scanner;

// k만큼 0에서 1로 변경이 가능함
class Problem6 {
    public int solution (int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
//            System.out.println(cnt);
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
//            System.out.println(arr[rt] + " " + (rt - lt + 1) + " " + cnt);

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem6 T = new Problem6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, k, arr));
    }
}
