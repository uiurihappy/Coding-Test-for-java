package ChannelTalk;

import java.util.Scanner;

/**
 * 3개의 숫자 mod1, mod2, max_range가 주어집니다.
 * 1 이상 max_range 이하의 자연수 중에서 mod1로 나누어떨어지지만,
 * mod2로 나누어떨어지지 않는 수의 개수 return
 */
public class Problem1 {

    public int solution(int mod1, int mod2, int max_range) {
        int answer = 0;
        // sol 1
        for (int i = mod1; i <= max_range; i+= mod1)
            if (i % mod2 != 0)
                answer++;

        int k = mod1;
        // sol 2
//        while (k <= max_range) {
//            if (k % mod2 != 0)
//                answer++;
//            k += mod1;
//            if (k > max_range)
//                break;
//        }
        return answer;
    }
    public static void main(String[] args) {
        Problem1 T = new Problem1();
        Scanner kb = new Scanner(System.in);
        int mod1 = kb.nextInt();
        int mod2 = kb.nextInt();
        int max_range = kb.nextInt();
        System.out.println(T.solution(mod1, mod2, max_range));
    }
}
