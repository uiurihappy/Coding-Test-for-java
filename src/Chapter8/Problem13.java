package Chapter8;

import java.util.Scanner;

public class Problem13 {

    static int n, answer = 0;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y, int[][] board) {

    }

    public void solution(int[][] board) {

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
