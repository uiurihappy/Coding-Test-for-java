package Programmers;

import java.util.*;

/** 옹알이 (1)
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return
 * input1
 5
 aya yee u maa wyeoo
 * input2
 5
 ayaye uuuma ye yemawoo ayaa
 * output1
 1
 * output2
 3
 */
public class Babbling {

    static int n, answer = 0;
    static String[] babbling;

    public void solution(String[] babbling) {

        for (int i = 0; i < babbling.length; i++) {
            // "wyeoo" 이면 "ye"를 지우면 "woo"가 되기 때문에
            // 1로 replace해서 1을 공백 처리 한다.
            // 번거롭지만 예외 처리 때문에 해야 함
            babbling[i] = babbling[i].replaceFirst("aya", "1");
            babbling[i] = babbling[i].replaceFirst("woo", "1");
            babbling[i] = babbling[i].replaceFirst("ye", "1");
            babbling[i] = babbling[i].replaceFirst("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
//            System.out.println(babbling[i]);

            if (babbling[i].isEmpty())
                answer++;
        }

    }

    public static void main(String[] args) {
        Babbling T = new Babbling();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        babbling = new String[n];

        for (int i = 0; i < n; i++)
            babbling[i] = kb.next();

        T.solution(babbling);

        System.out.println(answer);
    }

}
