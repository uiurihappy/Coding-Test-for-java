import java.util.*;

public class Test4 {
    public static int gainMaxValue(List<Integer> security_val, int k) {
        int n = security_val.size();
        int[] prefixSum = new int[n + 1];

        // Calculate the prefix sum of security values
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + security_val.get(i - 1);
        }

        int maxSum = Integer.MIN_VALUE;

        // Iterate through each possible starting node
        for (int i = 0; i < k; i++) {
            int sum = 0;

            // Calculate the security value sum for the current window
            for (int j = i; j < n; j += k) {
                sum += security_val.get(j);

                // Update the maximum security value sum
                maxSum = Math.max(maxSum, sum);

                // If the security value sum becomes negative, reset it to 0
                if (sum < 0) {
                    sum = 0;
                }
            }
        }

        return maxSum;
    }



    public static void main(String[] args) {
//        // 예시 입력 1
//        List<Integer> security_val1 = List.of(2, 5, -8, -6, -7);
//        int k1 = 3;
//
//        // gainMaxValue 함수 호출 및 결과 출력
//        int result1 = gainMaxValue(security_val1, k1);
//        System.out.println(result1); // 예상 출력: -2

        // 예시 입력 2
        List<Integer> security_val2 = List.of(3, 5, -2, -4, 9, 16);
        int k2 = 2;

        // gainMaxValue 함수 호출 및 결과 출력
        int result2 = gainMaxValue(security_val2, k2);
        System.out.println(result2); // 예상 출력: 17
    }
}
