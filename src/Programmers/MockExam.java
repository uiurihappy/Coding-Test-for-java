package Programmers;

import java.util.*;

/** 모의고사
 * input1
 5
 1 2 3 4 5
 * output1
 1
 * input2
 5
 1 3 2 4 2
 * output2
 1 2 3
 */
public class MockExam {

    public int[] solution(int[] answers) {

        int[] first = {1,2,3,4,5}; // 5개씩 반복
        int[] second = {2,1,2,3,2,4,2,5}; // 8개씩 반복
        int[] third = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int[] score = {0,0,0}; // 각 수포자들의 점수

        // 수포자들의 점수 계산
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) score[0]++;
            if (answers[i] == second[i % 8]) score[1]++;
            if (answers[i] == third[i % 10]) score[2]++;
        }
//        for (int x : score)
//            System.out.print(x + " ");
//        System.out.println();

        // 최대 점수 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 최대 점수를 가진 수포자 리스트 생성
        ArrayList<Integer> answ = new ArrayList<>();
        for(int i = 0; i < score.length; i++)
            if(max == score[i])
                answ.add(i+1);

        return answ.stream().mapToInt(num -> num).toArray();
    }

    public static void main(String[] args) {
        MockExam T = new MockExam();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] answers = new int[n];
        for (int i = 0; i < n; i++)
            answers[i] = kb.nextInt();
        for (int x : T.solution(answers))
            System.out.print(x + " ");
    }
}
