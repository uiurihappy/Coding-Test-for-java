package Programmers.Lv2;

import java.util.Scanner;

/** 타겟 넘버
 * input1
 5
 1 1 1 1 1
 3
 * output1
 5
 * input2
 4
 4 1 2 1
 4
 * output2
 2
 */
public class TargetNumber {

    public static int answer = 0;
    public int solution(int[] numbers, int target){
        dfs(numbers, 0, target, 0);

        return answer;
    }

    // numbers : 알고리즘을 실행할 대상 배열
    // depth : 노드의 깊이
    // target : 타겟 넘버
    // sum : 이전 노드 까지의 결과 값

    public void dfs(int[] numbers, int depth, int target, int sum){
        //마지막 노드 탐색
        if(depth == numbers.length){
            if(target == sum)
                answer++;
        }
        else{
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }

    public static void main(String[] args) {
        TargetNumber T = new TargetNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = kb.nextInt();
        int target = kb.nextInt();
        System.out.println(T.solution(numbers, target));
    }
}
