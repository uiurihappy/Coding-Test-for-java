package Programmers;

import java.util.*;
import java.util.stream.Stream;

public class MaxAndMinValue {

    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] str = Stream.of(arr).mapToInt(Integer::parseInt).toArray();


        int max = Arrays.stream(str).max().getAsInt();
        int min = Arrays.stream(str).min().getAsInt();


        return min + " " + max;
    }

    public static void main(String[] args) {
        MaxAndMinValue T = new MaxAndMinValue();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));

    }
}
