package Chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/** 인접리스트, ArrayList
 * input1
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
 6
 */
public class Problem10 {

    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, visited;

    public void DFS (int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (visited[nv] == 0) {
                    visited[nv] = 1;
                    DFS(nv);
                    visited[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Problem10 T = new Problem10();
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

        // 방문 배열 init
        visited = new int[n + 1];
        visited[1] = 1;
        T.DFS(1);

        System.out.println(answer);
    }
}
