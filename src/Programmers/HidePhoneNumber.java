package Programmers;

import java.util.Scanner;

/** 핸드폰 번호 가리기
 * input1
 01033334444
 * output1
 *******4444
 * input2
 027778888
 * output2
 *****8888
 */
public class HidePhoneNumber {

	public String solution(String phone_number) {
		// sol 1
		// return phone_number.replaceAll(".(?=.{4})", "*");

		// sol 2
		//     char[] ch = phone_number.toCharArray();
		//     for(int i = 0; i < ch.length - 4; i ++){
		//         ch[i] = '*';
		//     }
		//     return String.valueOf(ch);

		// sol 3
		return phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*") + phone_number.substring(phone_number.length() - 4);
	}

	public static void main(String[] args) {
		HidePhoneNumber T = new HidePhoneNumber();
		Scanner kb = new Scanner(System.in);
		String phone_number = kb.next();
		System.out.println(T.solution(phone_number));
	}
}
