package yanolja;
import java.util.*;

public class Test1 {

	public int solution(int[] A) {
		int count = 1;
		int N = A.length;

		for (int i = 1; i < N - 1 ; i++) {
			if ((A[i] > A[i - 1] && A[i] >= A[i + 1]) || (A[i] < A[i - 1] && A[i] <= A[i + 1])) {
				count++;
				i++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Test1 T = new Test1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = kb.nextInt();
		}
		System.out.println(T.solution(A));

	}
}
