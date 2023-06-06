package Programmers.Lv2;

import java.util.Scanner;

/** 네트워크
 * input1
 3
 1 1 0
 1 1 0
 0 0 1
 * output1
 2
 * input2
 3
 1 1 0
 1 1 1
 0 1 1
 * output2
 1
 */
// dfs
public class Network {
    boolean[] dfs(int[][] computers, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                check = dfs(computers, j, check);
            }
        }
        return check;
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(computers, i, check);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Network T = new Network();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] computers = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                computers[i][j] = kb.nextInt();

        System.out.println(T.solution(n, computers));
    }
}
