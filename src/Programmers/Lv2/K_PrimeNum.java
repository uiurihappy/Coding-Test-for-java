package Programmers.Lv2;

import java.util.Scanner;

public class K_PrimeNum {

	// 소수 판별
	public boolean isPrime(long n){
		if (n <= 1) return false;
		else if (n == 2) return true;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	// k진수 변환
	public String to_Knum(int n, int k) {
		String res = "";
		while (n > 0) {
			res = n % k + res;
			n /= k;
		}
//		System.out.println(res);
		return res;
	}

	public int solution(int n, int k) {
		int answer = 0, j;
		String s = to_Knum(n, k);
		for (int i = 0; i < s.length(); i = j) {
			for (j = i + 1; j < s.length() && s.charAt(j) != '0'; j++);

			if (isPrime(Long.parseLong(s.substring(i, j))))
				answer++;

		}
		return answer;
	}

	public static void main(String[] args) {
		K_PrimeNum T = new K_PrimeNum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
