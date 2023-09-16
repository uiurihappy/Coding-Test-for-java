package BucketPlace_1;

import java.util.Scanner;

public class Test1 {

	public boolean solution(String target, String typed) {
		int targetIndex = 0;
		int typedIndex = 0;

		while (typedIndex < typed.length()) {
			if (targetIndex < target.length() && target.charAt(targetIndex) == typed.charAt(typedIndex)) {
				targetIndex++;
				typedIndex++;
			} else if (typedIndex == 0 || typed.charAt(typedIndex) != typed.charAt(typedIndex - 1)) {
				return false;
			} else {
				typedIndex++;
			}
		}

		return targetIndex == target.length();
	}


	public static void main(String[] args) {
		Test1 T = new Test1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

	}
}
