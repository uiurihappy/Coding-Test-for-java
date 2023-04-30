package Programmers;

import java.util.*;

public class HallOfFame {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> topList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (topList.size() < k) {
                topList.add(score[i]);
            } else {
                if (topList.get(0) < score[i]) {
                    topList.set(0, score[i]);
                }
            }
            Collections.sort(topList);
            answer[i] = topList.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        HallOfFame T = new HallOfFame();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int n = kb.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = kb.nextInt();
        }
        for (int x : T.solution(k, score))
            System.out.print(x + " ");
    }
}
