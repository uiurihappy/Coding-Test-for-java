package Chapter8;

import java.util.Scanner;

/** 섬나라 아일랜드 (DFS)
 * input1
 7
 1 1 0 0 0 1 0
 0 1 1 0 1 1 0
 0 1 0 0 0 0 0
 0 0 0 1 0 1 1
 1 1 0 1 1 0 0
 1 0 0 0 1 0 0
 1 0 1 0 1 0 0
 * output1
 * 5
 */
public class Problem13 {

    static int n, answer = 0;
    static int[][] board;
    // 대각선 범위까지 check
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 범위 내, 그리고 nx, ny 좌표에 있는 값이 1인 경우 좌우방향, 대각선을 0으로 바꾼다.
            // 그리고 DFS 재귀
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    // 일단 counting
                    answer++;
                    // 시작 지점 0으로 초기화
                    board[i][j] = 0;

                    DFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Problem13 T = new Problem13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = kb.nextInt();

        T.solution(board);

        System.out.println(answer);
    }
}
