package Chapter7;
import java.util.*;
import java.io.*;
/** 그래프 최단거리
 * input
 * 정점의 수 N, 간선의 수 M
 6 9

 1 3
 1 4
 2 1
 2 5
 3 4
 4 5
 4 6
 6 2
 6 5
 * output
 * 1번 정점에서 각 정점으로 가는 최소 간선 수를 2번 정점부터 차례대로 출력
 2 : 3
 3 : 1
 4 : 1
 5 : 2
 6 : 2
 */
public class Problem12 {

    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, ch;
    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int cur = queue.poll();
                dis[cur] = L;
                for (int nv : graph.get(cur)) {
                    // 방문 체크
                    if (ch[nv] == 0) {
                        ch[nv] = 1;
                        queue.offer(nv);
                    }
                }
            }
            L++;
        }
    }
    public static void main(String[] args) throws IOException {
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
        ch = new int[n + 1];
        dis = new int[n + 1];

        ch[1] = 1;

        // 1번 정점부터 시작
        bfs(1);

        // 1부터 시작하니 1은 할 필요 없음
        for (int i = 2; i <= n; i++)
            System.out.println(i + " : " + dis[i]);

    }
}
