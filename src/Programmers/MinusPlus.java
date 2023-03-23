package Programmers;

import java.util.Scanner;

public class MinusPlus {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++)
            answer += absolutes[i] * (signs[i] ? 1 : -1);

        return answer;
    }

    public static void main(String[] args) {
        MinusPlus T = new MinusPlus();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];

        for (int i = 0; i < n; i++)
            absolutes[i] = kb.nextInt();

        for (int i = 0; i < n; i++)
            signs[i] = kb.nextBoolean();


    }
}
