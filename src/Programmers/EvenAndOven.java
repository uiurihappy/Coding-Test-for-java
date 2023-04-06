package Programmers;

import java.util.Scanner;

public class EvenAndOven {

    public String solution(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }

    public static void main(String[] args) {
        EvenAndOven T = new EvenAndOven();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }
}
