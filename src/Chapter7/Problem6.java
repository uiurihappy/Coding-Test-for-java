package Chapter7;

import java.util.*;

/** 송아지 찾기 (최단 거리 알고리즘, BFS)
 * input
 * 5 14
 * output
 * 3
 *
 */
public class Problem6 {
    int[] dis = {1, -1, 5};     // 거리
    int[] ch;                   // 좌표
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        queue.offer(S);
        int L = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();
            // 탐색
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                // 송아지 거리면 return
//                if (x == E)
//                    return L;

                // 자식 노드 지정
                for (int d : dis) {
                    int nx = x + d;

                    // 송아지 거리면 return
                    if (nx == E)
                        return L + 1;

                    // ch[nx] == 0 : 방문 안했을 때
                    if (nx >= 1 && nx < 10001 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }

                }
            }
            L++;
        }
        return 1;
    }

    public static void main(String[] args) {
        Problem6 T = new Problem6();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int E = kb.nextInt();

        System.out.println(T.BFS(S, E));
    }
}
