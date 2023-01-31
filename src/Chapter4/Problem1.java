package Chapter4;

import java.util.*;

/*
** 학급 회장(해쉬)
* input
15
BACBACCACCBDEDE

* output
C
 */

class Problem1 {

    public Character solution (int n, String str) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // keySet: HashMap에 정의된 key type에 맞춰 추출
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem1 T = new Problem1();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(T.solution(n, str));
    }
}
