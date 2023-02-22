package Chapter6;

import java.util.*;

class Point implements Comparable<Point> {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x == o.x) {
			System.out.println("x Compare = " + (this.y - o.y));
			return this.y - o.y;
		}
		else {
			System.out.println("y Compare = " + (this.x - o.y));
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
