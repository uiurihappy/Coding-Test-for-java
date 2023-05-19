package Programmers.Lv2;

import java.util.*;

public class Endgame {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> people = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                String s1 = words[i - 1];
                String s2 = words[i];

                char last1 = s1.charAt(s1.length() - 1);
                char first2 = s2.charAt(0);

                if (people.containsKey(s2) || last1 != first2) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }

            people.put(words[i], 1);
        }

        return answer;
    }
    public static void main(String[] args) {
        Endgame T = new Endgame();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        String[] words = new String[k];
        for (int i = 0; i < k; i++)
            words[i] = kb.next();
        for (int x : T.solution(n, words))
            System.out.print(x + " ");
    }
}
