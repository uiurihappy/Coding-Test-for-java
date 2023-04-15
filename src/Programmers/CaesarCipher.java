package Programmers;

import java.util.Scanner;

/** 시저 암호
 * input1
 AB 1
 * output1
 BC
 * input2
 z 1
 * output2
 a
 * input3
 a B z
 4
 * output3
 e F d
 */
public class CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                answer.append((char)(c + n - (c + n <= 'z' ? 0 : 26)));
            } else if(c >= 'A' && c <= 'Z') {
                answer.append((char)(c + n - (c + n <= 'Z' ? 0 : 26)));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        CaesarCipher T = new CaesarCipher();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        int n = kb.nextInt();
        System.out.println(T.solution(s, n));
    }
}
