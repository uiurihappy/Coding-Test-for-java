package Programmers.Lv2;

import java.util.*;

public class LifeBoat {

    public int solution(int[] people, int limit) {
        int answer = 0, min = 0;
        Arrays.sort(people);
        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        LifeBoat T = new LifeBoat();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int []people = new int[n];
        for (int i = 0; i < n; i++)
            people[i] = kb.nextInt();
        int limit = kb.nextInt();
        System.out.println(T.solution(people, limit));
    }
}
