package Programmers;

import java.util.*;

/** 문자열 내 마음대로 정렬하기
 * input1
3
sun bed car
1
 * output1
car bed sun
 * input2
3
abce abcd cdx
2
 * output2
 abcd abce cdx
 */
public class RandomSortString {
    public String[] solution(String[] strings, int n) {
        // sol 1
//        String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;

        // n의 인덱스대로 오름차순
        String[] answer = new String[strings.length];
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) > s2.charAt(n)) return 1;
            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else if(s1.charAt(n) < s2.charAt(n)) return -1;
            else return 0;
        });
        return answer;
    }

    public static void main(String[] args) {
        RandomSortString T = new RandomSortString();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        String[] strings = new String[k];
        for (int i = 0; i < k; i++)
            strings[i] = kb.next();
        int n = kb.nextInt();
        for (String x: T.solution(strings, n))
            System.out.print(x + " ");
    }
}
