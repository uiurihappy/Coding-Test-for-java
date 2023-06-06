package EK;
import java.util.Scanner;
/*
5
9 3 9 9 9 5 2 7 8 9 8 1 5 8 9 6 1 8 7 9 9 9 8 9 9
 */
public class EK_Test3 {

    static int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; //상, 하, 좌, 우
    static boolean[][] visited; //방문 여부를 저장할 배열
    static int[][] realBoard; //격자판 배열
    static int K; //격자판 크기, 중심 좌표

    public int solution(int[] board, int N) {
        K = (N + 1) / 2 - 1; //중심 좌표 계산
        realBoard = new int[N][N]; //2차원 배열로 변환
        for (int i = 0; i < N * N; i++) {
            realBoard[i / N][i % N] = board[i];
        }

        visited = new boolean[N][N]; //방문 여부 배열 초기화
        visited[K][K] = true; //시작점 방문 처리

        return dfs(K, K, 0, N); //DFS 탐색 시작
    }

    public int dfs(int x, int y, int sum, int N) {
        if (x == 0 || y == 0 || x == N - 1 || y == N - 1) { //격자판의 경계를 벗어나는 경우
            return sum + realBoard[x][y]; //최종 합 계산 후 반환
        }

        int minSum = Integer.MAX_VALUE; //최소 합을 저장할 변수 초기화
        for (int[] dir : dirs) { //4방향으로 탐색
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx < 0 || ny < 0 || nx >= N || ny >= N || ny == nx || visited[nx][ny]) { //이동 불가능한 경우
                continue;
            }
            visited[nx][ny] = true; //방문 처리
            minSum = Math.min(minSum, dfs(nx, ny, sum + realBoard[x][y], N)); //최소 합 갱신
            visited[nx][ny] = false; //방문 해제
        }
        return minSum; //최소 합 반환
    }

    public static void main(String[] args) {
        EK_Test3 T = new EK_Test3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] board = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            board[i] = kb.nextInt();
        }
        System.out.println(T.solution(board, n));
    }
}
