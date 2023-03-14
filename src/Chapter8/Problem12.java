package Chapter8;

import java.util.*;

/** 토마토 (BFS)
 * input1
 6 4
 0 0 -1 0 0 0
 0 0 1 0 -1 0
 0 0 -1 0 0 0
 0 0 0 0 -1 1
 * output1
 4
 */

class Point12 {
    public int x, y;

    public Point12(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Problem12 {

    static int n, m;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static Queue<Point12> queue = new LinkedList<>();

    public void BFS() {
        while(!queue.isEmpty()) {
            // 0,0 부터 탐색 시작한다.
            Point12 temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point12(nx, ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Problem12 T = new Problem12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        board = new int[m][n];
        dis = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) queue.offer(new Point12(i, j));
            }

        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++){
                if (board[i][j] == 0) flag = false;
            }

        if (flag) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    answer = Math.max(dis[i][j], answer);
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }

    }
}
