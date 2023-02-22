package Chapter6;

import java.util.*;

/**
 * 좌표 정렬
 * input
5
2 7
1 3
1 2
2 5
3 6
 * output
1 2
1 3
2 5
2 7
3 6
 */
class Point implements Comparable<Point> {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// sort 함수의 정렬 기준
	@Override
	public int compareTo(Point o) {
		if (this.x == o.x) {
//			System.out.println("x Compare = " + (this.y - o.y));
			// 오름차순: this (현 메소드 객체) 뒤에 o (받아온 객체) 정렬될려면 음수값으로 return 받아야 한다.
			return this.y - o.y;
		}
		else {
//			System.out.println("y Compare = " + (this.x - o.y));
			return this.x - o.x;
		}
	}
}

class Problem7 {


	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();

			arr.add(new Point(x, y));
		}

		Collections.sort(arr);
		for (Point o : arr)
			System.out.println(o.x + " " + o.y);
	}
}
