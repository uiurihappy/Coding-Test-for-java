package Programmers;

import java.util.Scanner;

public class LoginSuccess {

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        LoginSuccess T = new LoginSuccess();
        Scanner kb = new Scanner(System.in);
        String[] id_pw = new String[2];
        for (int i = 0; i < 2; i++)
            id_pw[i] = kb.next();
        int n = kb.nextInt();
        String[][] db = new String[n][2];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                db[i][j] = kb.next();

        System.out.println(T.solution(id_pw, db));
    }

}
