package Chapter7;

import java.util.Scanner;

class Number {
	static int num = 0;
	int num2 = 0;
}

/**
 * 피보나치 수열
 * input
 10
 * output
 1 1 2 3 5 8 13 21 34 55
 */
class Problem4 {
	// 정적 배열
	static int[] fibo;

	// 1이나 2면 바로 return;
	public int solution(int n) {
		if (fibo[n] > 0) return fibo[n];

		if (n == 1) return fibo[n] = 1;
		else if (n == 2) return fibo[n] = 1;
		else return fibo[n] = solution(n - 2) + solution(n - 1);
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n + 1];
		T.solution(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}

		System.out.println();

		Number number1 = new Number();
		Number number2 = new Number();

		// 클래스에 고정되어 있는 값
		//		Number.num++; 와 동일
		number1.num++;
		number2.num2++;

		// 클래스 변수이므로 Number 클래스에 종속
		System.out.println("number2 = " + number2.num);
		// 인스턴스 변수이므로 main 클래스에 종속
		System.out.println("number2 = " + number2.num2);

	}
}
