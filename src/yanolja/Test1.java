package yanolja;
import java.util.*;

/** Test 1
 * input1
 12
 2 2 3 4 3 3 2 2 1 1 2 5
 * output1
 4
 * input2
 2
 -3 -3
 * output2
 1
 */
public class Test1 {

	public int solution(int[] A) {
		int count = 1;
		int N = A.length;

		for (int i = 1; i < N - 1; i++) {
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
