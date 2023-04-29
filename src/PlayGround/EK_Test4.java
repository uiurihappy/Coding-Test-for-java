package PlayGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
5
0 0 1 0 0
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
0 0 1 0 0

4

7
0 0 0 1 0 0 0
0 0 1 0 1 1 0
0 1 0 1 0 0 1
1 0 0 0 1 1 0
0 1 0 1 0 1 0
1 0 1 0 0 0 1
0 1 0 1 0 1 0

3
 */
public class EK_Test4 {

    static private int[][] board;
    static private boolean[][] visited;
    static private int count = 0;

    public int solution(int[][] board) {
        int n = board.length;
        visited = new boolean[n][n];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j, n);
                }
            }
        }

        return count;
    }

    private void dfs(int x, int y, int n) {
        visited[x][y] = true;

        // 현재 위치에서 상하좌우에 있는 1들을 찾음
        List<int[]> neighbors = findNeighbors(x, y);

        // 1들의 조합 중에서 다이아몬드 모양인 것을 찾음
        for (int[] neighbor1 : neighbors) {
            for (int[] neighbor2 : neighbors) {
                if (neighbor1 == neighbor2) {
                    continue;
                }
                int dx = neighbor1[0] - x + neighbor2[0];
                int dy = neighbor1[1] - y + neighbor2[1];
                if (dx < 0 || dx >= n || dy < 0 || dy >= n || board[dx][dy] != 1) {
                    continue;
                }
                if (!visited[dx][dy]) {
                    dfs(dx, dy, n);
                }
            }
        }
        count++;
    }

    private List<int[]> findNeighbors(int x, int y) {
        int n = board.length;
        List<int[]> neighbors = new ArrayList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }
            if (board[nx][ny] == 1) {
                neighbors.add(new int[]{nx, ny});
            }
        }
        return neighbors;
    }

    public static void main(String[] args) {
        EK_Test4 T = new EK_Test4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                board[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(board));
    }

}
