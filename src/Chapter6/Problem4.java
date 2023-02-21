package Chapter6;

import java.util.Scanner;
/*
** 해결방법 LRU 알고리즘
 처리할 작업을 차례대로 읽으며 캐시 배열에 입력한다
 입력할 작업이 캐시에 없다면 배열의 값을 한칸씩 뒤로 밀고 제일 앞에 작업을 입력
 캐시에 있다면 값이 있는 위치에 앞에서부터 차례로 뒤로 밀고 제일 앞에 작업을 입력

* s: 캐시 메모리 크기, n: 작업 수
 * input
5 9
1 2 3 2 6 2 3 5 7
 * output
7 5 3 2 6

*/
class Problem4 {

    public int[] solution (int s, int n, int[] arr) {
        int[] cache = new int[s];
        for (int x : arr) {
            int i;
            // 같은 값이 있는지 찾는 반복문
            for (i = 0; i < s; i++) {
                // 같은 값이 있다면
                if (cache[i] == x) {
                    // 그 자리부터 앞에서 차례로 뒤로 밀어줌
                    while(i != 0){
                        cache[i] = cache[i - 1];
                        i--;
                    }
                    // 제일 앞에 값 입력
                    cache[0] = x;
                    break;
                }
            }
            // 반복문을 끝까지 돌았을 때 제일 앞에 값을 입력해줌
            if (i == s){
                while (i != 1){
                    i--;
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        Problem4 T = new Problem4();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        for (int x : T.solution(s, n, arr))
            System.out.print(x + " ");

    }
}
