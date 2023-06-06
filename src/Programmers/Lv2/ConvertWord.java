package Programmers.Lv2;

import java.util.*;

/** 단어 변환
 * input1
 hit
 cog
 6
 hot dot dog lot log cog
 * output1
 4
 * input2
 hit
 cog
 5
 hot dot dog lot log
 * output2
 0
 */
public class ConvertWord {

    public static boolean[] visited;
    public static int answer = 0;

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i])
                continue;

            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++)
                if (begin.charAt(j) == words[i].charAt(j))
                    k++;

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                // cnt 누적하면서 dfs 탐색
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        boolean isExist = Arrays.asList(words).contains(target);
        if (!isExist)
            return 0;
        dfs(begin, target, words, 0);

        return answer;
    }

    public static void main(String[] args) {
        ConvertWord T = new ConvertWord();
        Scanner kb = new Scanner(System.in);
        String begin = kb.next();
        String target = kb.next();
        int n = kb.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++)
            words[i] = kb.next();
        System.out.println(T.solution(begin, target, words));
    }

}
