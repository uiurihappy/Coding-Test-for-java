package Programmers;

import java.util.Scanner;

public class Hashad {

    public boolean solution(int x) {
        boolean answer = false;
        String num = String.valueOf(x);
        int temp = 0;
        for (char a : num.toCharArray()) {
            temp += Integer.parseInt(String.valueOf(a));
        }

        if (x % temp == 0) return true;
        return answer;
    }

    public static void main(String[] args) {
        Hashad T = new Hashad();
        Scanner kb = new Scanner(System.in);
        int arr = kb.nextInt();
        System.out.println(T.solution(arr));
    }
}
