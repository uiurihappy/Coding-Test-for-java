package Chapter7;

import java.io.*;
import java.util.*;

/** 경로 탐색 (인접리스트)
 * 정점의 수 n, 간선의 수 m
 * input 1
 5 9
 1 2
 1 3
 1 4
 2 1
 2 3
 2 5
 3 4
 4 2
 4 5

 * output1
 * 6
 */
public class Problem9 {

    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, visited;

    public static void dfs(int v) {
        if (v == n) answer++;
        else {
            for (int i = 0; i <= n; i++) {
                if (graph.get(v).get(i) == 1 && visited[i] == 0) {
                    visited[i] = 1;
                    dfs(i);
                    visited[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Problem9 T = new Problem9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 그래프 init
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<Integer>());

        // 그래프 insert
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        // 방문 배열, 거리 배열 init
        visited = new int[n + 1];

        visited[1] = 1;

        // 1번 정점부터 시작
        dfs(1);
        System.out.println();

    }
}
