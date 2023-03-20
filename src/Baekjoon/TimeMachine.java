package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/** 타임머신 (11657)
 * input1
 3 4
 1 2 4
 1 3 3
 2 3 -1
 3 1 -2
 * output1
 4
 3
 * input2
 3 4
 1 2 4
 1 3 3
 2 3 -4
 3 1 -2
 * output2
 -1
 */
class Bus {
    // 시작점, 도착점, 걸리는 시간
    int start, end, weight;

    public Bus(int start, int end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}

public class TimeMachine {
    // init
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int INF = 500 * 10_000;
    static int n, m;
    static int dist[];
    static Bus busArr[];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 도시
        n = Integer.parseInt(st.nextToken());
        // 버스 노선
        m = Integer.parseInt(st.nextToken());

        // 도시 Arr
        dist = new int[n + 1];
        // 버스 노선
        busArr = new Bus[m + 1];

        // 최단거리 배열 무한대로 초기화
        for(int i = 1 ; i <= n; i++)
            dist[i] = INF;

        // 입력값 초기화
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            busArr[i] = new Bus(start, end, time);
        }
        // 결과 출력을 위한 객체
        StringBuilder sb = new StringBuilder();

        // 음의 cycle이 없는 경우
        if (bellmanFord()) {
            for(int i = 2; i <= n; i++){
                sb.append(dist[i] == INF ? "-1\n" : dist[i] + "\n");
            }
            // 음의 cycle이 있는 경우
        } else {
            sb.append("-1\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    // 음의 cycle이 있다면 false 리턴, 없다면 true 리턴
    // 벨만포드 알고리즘
    private static boolean bellmanFord() {
        // 시작점 최단거리 0 갱신
        dist[1] = 0;

        // v - 1번 수행
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                Bus bus = busArr[j];
                // 더 작은 최단거리 가 있는 경우 갱신
                if (dist[bus.start] != INF && dist[bus.end] > dist[bus.start] + bus.weight){
                    dist[bus.end] = dist[bus.start] + bus.weight;
                }
            }
        }

        // 음수 cycle 확인
        // 갱신되는게 있다면 음수 cycle이 있다는 뜻
        for(int i = 0; i < m; i++){
            Bus bus = busArr[i];

            if (dist[bus.start] != INF &&dist[bus.end] > dist[bus.start] + bus.weight)
                return false;
        }

        return true;
    }
}
