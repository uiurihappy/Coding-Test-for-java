package Programmers;

import java.util.*;

/** 대충 만든 자판
 * input1
 2
 ABACD BCEFD
 ABCD AABB
 * output1
 9 4
 * input2
 2
 AGZ BSSS
 ASA BGZ
 * output2
 4 6
 * input3
 1
 AA
 B
 * output3
 -1
 */
public class RoughKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int[] answer = new int[targets.length];
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (!hm.containsKey(c) || i < hm.get(c))
                    hm.put(c, i + 1);
            }
        }
//        System.out.println(hm);

        for(int i = 0 ; i < targets.length; i++) {
            int cnt = 0;
            for(int j = 0 ; j < targets[i].length() ; j++) {
                char c = targets[i].charAt(j);
                if (!hm.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            answer[i] = cnt == 0 ? -1 : cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        RoughKeyboard T = new RoughKeyboard();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();

        String[] keymap = new String[k];
        String[] targets = new String[k];

        for (int i = 0; i < k; i++)
            keymap[i] = kb.next();

        for (int i = 0; i < k; i++)
            targets[i] = kb.next();


        for (int x : T.solution(keymap, targets))
            System.out.print(x + " ");
    }
}
