package BucketPlace_1;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for(int i = 0; i < citations.length; i++){
			int smaller = Math.min(citations[i], citations.length - i);
			answer = Math.max(answer, smaller);
		}
		return answer;
	}

	public static void main(String[] args) {
		Test4 T = new Test4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] citations = new int[n];
		for (int i = 0; i < n; i++)
			citations[i] = kb.nextInt();
		System.out.println(T.solution(citations));
	}
}
