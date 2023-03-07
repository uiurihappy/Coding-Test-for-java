package Chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem10 {

    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, visited;

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
            graph.get(a).set(b, 1);
        }

        // 방문 배열, 거리 배열 init
        visited = new int[n + 1];

        visited[1] = 1;
    }
}
