package Jobda;

import java.util.Scanner;

/** 페이지 이동하기
 * input1
3
google yahoo midasit
3
BACK BACK NEXT
 * output1
 yahoo
 */
public class Test1 {

    public String solution(String[] H, String[] C) {
        int idx = H.length - 1;
        String answer = H[idx];
        for (String s : C) {
            if (idx >= 0 && idx <= H.length - 1) {
                switch (s) {
                    case "BACK":
                        if (idx > 0) {
                            idx--;
                            answer = H[idx];
                        }
                        break;
                    case "NEXT":
                        if (idx < H.length - 1) {
                            idx++;
                            answer = H[idx];
                        }
                        break;
                    default:
                        break;
                }
                System.out.println(answer);
            } else {
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test1 T = new Test1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] H = new String[n];
        for (int i = 0; i < n; i++)
            H[i] = kb.next();
        int k = kb.nextInt();
        String[] C = new String[k];
        for (int i = 0; i < n; i++)
            C[i] = kb.next();

        System.out.println(T.solution(H, C));
    }
}
