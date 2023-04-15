package Programmers;

import java.util.HashMap;
import java.util.Scanner;

/** 가장 가까운 문자 찾기
 * input1
 banana
 * output1
 -1 -1 -1 2 2 2
 * input2
 foobar
 * output2
 -1 -1 1 -1 -1 -1
 */
public class NearByString {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            answer[i] = -1;
            // 현위치 char
            char tmp = s.charAt(i);
            int cnt = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp != s.charAt(j))
                    cnt++;
                else {
                    answer[i] = cnt;
                    break;
                }
            }
        }

        // sol 2
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            answer[i] = i - map.getOrDefault(ch, i + 1);
//            map.put(ch, i);
//        }
        return answer;
    }

    public static void main(String[] args) {
        NearByString T = new NearByString();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        for (int x : T.solution(s))
            System.out.print(x + " ");
    }
}
