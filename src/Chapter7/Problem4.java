package Chapter7;

import java.util.Scanner;

/**
 * 피보나치 수열
 * input
 10
 * output
 1 1 2 3 5 8 13 21 34 55
 * 재귀보다 for 문으로 돌리는 것이 더 성능 면으로는 좋다.
 * 이유는 재귀에 스택 프레임이 돌아가 메모리가 너무 사용된다.
 */

class Number {
	static int num = 0;
	int num2 = 0;
}


class Problem4 {
	// 정적 배열
	static int[] fibo;

	// 1이나 2면 바로 return;
	public int solution(int n) {
		if (fibo[n] > 0) return fibo[n];

		if (n <= 1) return fibo[n] = 1;
		else if (n == 2) {
			fibo[n] = 1;
			return fibo[n - 1] = 1;
		}
		else return fibo[n] = solution(n - 2) + solution(n - 1);
	}

	public static void main(String[] args) {
		Problem4 T = new Problem4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n + 1];

		// n번째 항
		T.solution(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}

		System.out.println();

		// solution 2
		// STEP 1. 결과값을 담을 배열 선언
		final int[] arr = new int[n + 1];

		// STEP 2. 첫번째 항과 두번쨰 항 미리 선언
		arr[1] = 1;
		arr[2] = 1;

		// STEP 3. 반복문을 이용하여, 계속해서 더해 나간다.
		System.out.print(arr[1] + " " + arr[2] + " ");
		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
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
