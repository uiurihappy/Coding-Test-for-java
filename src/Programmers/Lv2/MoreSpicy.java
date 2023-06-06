package Programmers.Lv2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/** 더 맵게
 * input1
 6
 1 2 3 9 10 12
 7
 * output1
 2
 */
public class MoreSpicy {

    // 스코빌 지수 규칙: 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int j : scoville)
            queue.offer(j);

        while(queue.peek() < K) {
            if (queue.size() == 1)
                return -1;
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        MoreSpicy T = new MoreSpicy();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] scoville = new int[n];
        for (int i = 0; i < n; i++) {
            scoville[i] = kb.nextInt();
        }
        int k = kb.nextInt();
        System.out.println(T.solution(scoville, k));
    }
}
