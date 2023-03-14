package Chapter8;

import java.util.*;

/** 피자 배달거리 (DFS)
 * input1
 4 4
 0 1 2 0
 1 0 2 1
 0 2 1 2
 2 0 1 2
 * output1
 6
 */

class Point15 {
    public int x, y;

    public Point15(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class Problem15 {

    static int n, m, answer = Integer.MAX_VALUE, len;
    static int[] combination;           // 조합 저장소
    static ArrayList<Point15> pz, hs;     // 피자집, 집 좌표들 ArrayList

    public void DFS(int L, int s) {
        if (L == m){
            int sum = 0;

            for (Point15 h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    // 집이 결정되면 집과 피자집 거리 구하는 공식
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        Problem15 T = new Problem15();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = kb.nextInt();
                if (temp == 1) hs.add(new Point15(i, j));
                else if (temp == 2) pz.add(new Point15(i, j));
            }
        }

        len = pz.size();
        combination = new int[m];

        // len C m 조합의 계산
        T.DFS(0,0);

        System.out.print(answer);
    }
}
