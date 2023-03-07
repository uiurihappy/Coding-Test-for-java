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
 3 4
 4 2
 4 5

 * output1
 * 6
 */
public class Problem9 {

    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, visited;

    public static void bfs(int v) {

    }

    public static void main(String[] args) throws IOException {
        Problem9 T = new Problem9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 그래프 init
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        // 그래프 insert
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        // 방문 배열, 거리 배열 init
        visited = new int[n + 1];
        dis = new int[n + 1];

        visited[1] = 1;

        // 1번 정점부터 시작
        T.bfs(1);

        // 1부터 시작하니 1은 할 필요 없음
        for (int i = 2; i <= n; i++)
            System.out.println(i + " : " + dis[i]);

    }
}
