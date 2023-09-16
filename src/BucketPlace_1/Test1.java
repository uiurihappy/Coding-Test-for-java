package BucketPlace_1;

import java.util.Scanner;

public class Test1 {

	public boolean solution(String target, String typed) {
		int targetIndex = 0;
		int typedIndex = 0;

		// target = "ohouse", typed = "oohoussse"
		// target.length = 6, typed.length = 9

		// target = "bucketplace", typed = "buckeetpladce"
		// target.length = 11, typed.length = 12
		while (typedIndex < typed.length()) {
			if (targetIndex < target.length() && target.charAt(targetIndex) == typed.charAt(typedIndex)) {
				targetIndex++;
				typedIndex++;
			} else if (typed.charAt(typedIndex) != typed.charAt(typedIndex - 1)) {
				return false;
			}
			typedIndex++;
		}

		return targetIndex == target.length();
	}


	public static void main(String[] args) {
		Test1 T = new Test1();
		Scanner kb = new Scanner(System.in);
		String target = kb.next();
		String typed = kb.next();
		System.out.println(T.solution(target, typed));
	}
}
