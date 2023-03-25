package Programmers;

import java.util.*;

public class ArrayCut {

    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();

        for(long i = left; i < right+1; i++){
            list.add((Math.max(i / n,i % n) + 1));
        }

        return list;

    }

    public static void main(String[] args) {
        ArrayCut T = new ArrayCut();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int left = kb.nextInt();
        int right = kb.nextInt();

        for (long x : T.solution(n, left, right))
            System.out.print(x + " ");

    }
}
