package ChannelTalk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * input1
 3 4 3

 1 1 2
 1 2 3
 2 4 2
 * output1
 0 6 3
 * input2
 3 3 6

 2 3 4
 1 1 1
 1 2 5
 1 3 5
 2 1 2
 2 3 3
 * output2
 *
 */
public class Problem2 {
    public long[] solution(int n, int m, int k, int[][] acts) {
        long[] answer = new long[k];
        int[][] grid = new int[n][m];

        for (int[] act : acts) {
            if (act[0] == 1)
                Arrays.fill(grid[act[1] - 1], act[2]);
            else {
                for (int j = 0; j < n; j++)
                    grid[j][act[1] - 1] = act[2];
            }
        }

        int[] colorCounts = new int[k + 1];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                colorCounts[grid[i][j]]++;

        for (int i = 1; i < k + 1; i++)
            answer[i - 1] = colorCounts[i];

        return answer;
    }
    public static void main(String[] args) {
        Problem2 T = new Problem2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int k = kb.nextInt();
        int[][] acts = new int[k][3];
        for (int i = 0; i < k; i++) {
            acts[i][0] = kb.nextInt();
            acts[i][1] = kb.nextInt();
            acts[i][2] = kb.nextInt();
        }
        for (long x : T.solution(n, m, k, acts))
            System.out.print(x + " ");
    }
}
