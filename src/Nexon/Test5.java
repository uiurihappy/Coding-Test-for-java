package Nexon;

import java.io.*;
import java.util.StringTokenizer;

public class Test5 {

    /*
     * Complete the 'countValidWords' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int countValidWords(String s) {
        String[] words = s.split("\\s+");
        int validCount = 0;

        for (String word : words) {
            if (isValidWord(word)) {
                validCount++;
            }
        }

        return validCount;
    }

    public static boolean isValidWord(String word) {
        int length = word.length();
        boolean hasVowel = false;
        boolean hasConsonant = false;

        if (length < 3) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (isVowel(c)) {
                hasVowel = true;
            } else {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        char C = Character.toUpperCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                C == 'A' || C == 'E' || C == 'I' || C == 'O' || C == 'U';
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int result = Test5.countValidWords(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
