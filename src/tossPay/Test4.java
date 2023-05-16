package tossPay;

import java.util.*;
import java.util.stream.Collectors;

/** 과일 게임
 * input1
 5 3
 40 30 10 20 40
 * output1
 40 30
 */
public class Test4 {
    public int[] solution(int[] fruitWeights, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < fruitWeights.length - k; i++) {
            int[] temp = Arrays.copyOfRange(fruitWeights, i, i + k);
            answer.add(Arrays.stream(temp).max().getAsInt());
            System.out.println(answer);
        }

        answer = answer.stream().distinct().collect(Collectors.toList());
        return answer.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Test4 T = new Test4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] fruitWeights = new int[n];
        int k = kb.nextInt();
        for (int i = 0; i < n; i++)
            fruitWeights[i] = kb.nextInt();

        for (int x : T.solution(fruitWeights, k))
            System.out.println(x + " ");
    }
}
