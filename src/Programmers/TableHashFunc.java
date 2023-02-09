package Programmers;

import java.util.*;

/*
* 테이블 해시 함수
input
4 3
2 2 6 1 5 10 4 2 9 3 8 3
2 2 3

output
4
 */

class TableHashFunc {

	public int solution(int[][] data, int col, int row_begin, int row_end) {
		int answer = 0;
		Arrays.sort(data, (o1, o2) -> {
			// 내림차순 정렬
//			return (o1[col - 1] == o2[col-1] ? o2[0] - o1[0] : o1[col-1] - o2[col - 1]);

			if(o1[col-1] > o2[col-1]) return 1;
				// 동일하면 첫 번째 컬럼 기준 내림차순 정렬
			else if(o1[col-1] == o2[col-1]) return o2[0] - o1[0];
			else return -1;
		});

		for(int i = row_begin - 1 ; i < row_end; i++){
			int sum = 0;
			for(int column : data[i]) sum += (column % (i + 1));

			// XOR 연산
			answer ^= sum;
		}

		return answer;
	}

	public static void main(String[] args) {
		TableHashFunc T = new TableHashFunc();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] data = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = kb.nextInt();
			}
		}

		int col = kb.nextInt();
		int row_begin = kb.nextInt();
		int row_end = kb.nextInt();

		System.out.println(T.solution(data, col, row_begin, row_end));
	}
}
