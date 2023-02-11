package Chapter6;

import java.util.Scanner;

/*
** Insertion sort (삽입 정렬)
 * input
 6
 13 5 11 7 23 15

 * output
 5 7 11 13 15 23

 */
class Problem3 {

    // 시간 복잡도 O(n^2), 안정 정렬
    public int[] solution(int n, int[] arr) {
        for (int i =  1; i < n; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp)
                    arr[j + 1] = arr[j];
                else
                    break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Problem3 T = new Problem3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++)
            arr[i] = kb.nextInt();

        for (int x : T.solution(n, arr))
            System.out.print(x + " ");
    }
}
