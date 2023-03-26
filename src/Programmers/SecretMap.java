package Programmers;

import java.util.Scanner;

/** 비밀지도 (카카오 1차)
 * input1
 5
 9 20 28 18 11
 30 1 21 17 28
 * output1
 "#####" "# # #" "### #" "# ##" "#####"
 * input2
 6
 46 33 33 22 31 50
 27 56 19 14 14 10
 * output2
 "######" "### #" "## ##" " #### " " #####" "### # "
 */
public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
//            System.out.println(temp);
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap T = new SecretMap();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++)
            arr1[i] = kb.nextInt();
        for (int i = 0; i < n; i++)
            arr2[i] = kb.nextInt();

        for (String str : T.solution(n, arr1, arr2))
            System.out.println(str);
    }
}
