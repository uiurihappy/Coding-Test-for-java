package Programmers.Lv2;

import java.util.*;

/** 게임 맵 최단거리
 * input1
 1 0 1 1 1 1 0 1 0 1 1 0 1 1 1 1 1 1 0 1 0 0 0 0 1
 * output1
 11
 * input2
 1 0 1 1 1 1 0 1 0 1 1 0 1 1 1 1 1 1 0 0 0 0 0 0 1
 * output2
 -1
 */

// bfs로 해결
public class ShortestDisInGame {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);

        // 끝자리까지 누적한 방문 수 대입
        answer = visited[maps.length-1][maps[0].length-1];

        return answer == 0 ? -1 : answer;
    }

    public void bfs(int[][] maps, int[][] visited) {
        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] n = queue.poll();
            int x = n[0];
            int y = n[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1)
                    continue;

                if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

    }

    public static void main(String[] args) {
        ShortestDisInGame T = new ShortestDisInGame();
        Scanner kb = new Scanner(System.in);
        int[][] maps = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                maps[i][j] = kb.nextInt();
        System.out.println(T.solution(maps));
    }
}
