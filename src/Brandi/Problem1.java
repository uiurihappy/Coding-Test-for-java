package Brandi;

import java.util.Scanner;

/*
전기 요금표와 사용한 전력량이 주어졌을 때, 납부해야 할 요금을 구하려고 합니다. 아래는 하나의 예시를 나타냅니다.

[전기 요금표]

전력량 구간(kWh)	기본 요금(원)	전력량 요금(원/kWh)
200 이하	910	93
200 초과 400 이하	1600	188
400 초과 655 이하	7300	281
655 초과	15372	435
사용한 전력량이 320(kWh)인 경우
기본 요금 1600원이 부과됩니다.
200 이하 구간에 대해서, 1kWh 당 93원의 요금이 부과됩니다.
200 x 93 = 18600
200 초과 400 이하 구간에 대해서, 1kWh 당 188원의 요금이 부과됩니다.
120 x 188 = 22560
따라서, 납부해야 할 총 요금은 1600 + 18600 + 22560 = 42,760원입니다.
사용한 전력량이 450(kWh)인 경우
기본 요금 7300원이 부과됩니다.
200 이하 구간에 대해서, 1kWh 당 93원의 요금이 부과됩니다.
200 x 93 = 18600
200 초과 400 이하 구간에 대해서, 1kWh 당 188원의 요금이 부과됩니다.
200 x 188 = 37600
400 초과 655 이하 구간에 대해서, 1kWh 당 281원의 요금이 부과됩니다.
50 x 281 = 14050
따라서, 납부해야 할 총 요금은 7300 + 18600 + 37600 + 14050 = 77,550원입니다.
전기 요금표를 나타내는 2차원 정수 배열 fees, 사용한 전력량(kWh)을 나타내는 정수 usage가 매개변수로 주어집니다. 이때, 납부해야 할 요금을 계산해서 return 하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ fees의 길이 ≤ 100

fees는 가장 작은 전력량 구간부터 가장 큰 전력량 구간까지의 요금 정보를 차례대로 담고 있습니다.
fees의 각 원소는 [a, b, c] 형식입니다.
a는 해당 구간의 최대 전력량(kWh)을 나타냅니다.
0 ≤ a ≤ 10,000
단, 마지막 구간은 최대 전력량이 정해져 있지 않으므로, fees의 마지막 원소에서만 유일하게 a값은 항상 0입니다.
b는 해당 구간의 기본 요금을 나타냅니다.
1 ≤ b ≤ 100,000
c는 해당 구간의 전력량 요금을 나타냅니다.
1 ≤ c ≤ 10,000
1 ≤ usage ≤ 10,000

입출력 예
fees	usage	result
[[200, 910, 93], [400, 1600, 188], [655, 7300, 281], [0, 15372, 435]]	320	42760
[[200, 910, 93], [400, 1600, 188], [655, 7300, 281], [0, 15372, 435]]	450	77550
[[1851, 1000, 100], [0, 2000, 155]]	1205	121500
[[100, 415, 90], [250, 1600, 389], [0, 7000, 480]]	530	208750
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.

입출력 예 #2

문제 예시와 같습니다.

입출력 예 #3

[전기 요금표]

전력량 구간(kWh)	기본 요금(원)	전력량 요금(원/kWh)
1851 이하	1000	100
1851 초과	2000	155
사용한 전력량은 1205(kWh)입니다.
기본 요금 1000원이 부과됩니다.
1851 이하 구간에 대해서, 1kWh 당 100원의 요금이 부과됩니다.
1205 x 100 = 120500
따라서, 납부해야 할 총 요금은 1000 + 120500 = 121,500원입니다.
입출력 예 #4

[전기 요금표]

전력량 구간(kWh)	기본 요금(원)	전력량 요금(원/kWh)
100 이하	415	90
100 초과 250 이하	1600	389
250 초과	7000	480
사용한 전력량은 530(kWh)입니다.

기본 요금 7000원이 부과됩니다.
100 이하 구간에 대해서, 1kWh 당 90원의 요금이 부과됩니다.
100 x 90 = 9000
100 초과 250 이하 구간에 대해서, 1kWh 당 389원의 요금이 부과됩니다.
150 x 389 = 58350
250 초과 구간에 대해서, 1kWh 당 480원의 요금이 부과됩니다.
280 x 480 = 134400
따라서, 납부해야 할 총 요금은 7000 + 9000 + 58350 + 134400 = 208,750원입니다.
 */

/*
* input1
4
200 910 93
400 1600 188
655 7300 281
0 15372 435
320
* output1
42760

* input2
4
200 910 93
400 1600 188
655 7300 281
0 15372 435
450
* output2
77550

* input3
2
1851 1000 100
0 2000 155
1205

* output3
121500

* input4
3
100 415 90
250 1600 389
0 7000 480
530

* output4
208750
 */
public class Problem1 {

	public int solution(int[][] fees, int usage) {
		int answer = 0;
		int temp = 0;
		int using = 0;

		// 기본 요금
		for (int i = 1; i < fees.length; i++) {
			if (fees[i - 1][0] < usage && usage <= fees[i][0]) {
				// 중간
				answer = fees[i][1];
				break;
			}
//			else if (fees[i][0] == 0 && usage <= fees[i][0]) {
//				System.out.println(2);
//				answer = fees[i - 1][1];
//				break;
//			} else if (fees[i][0] == 0 && fees[i - 1][0] < usage) {
//				System.out.println(3);
//				answer = fees[i][1];
//				break;
//			}
			else if (fees[fees.length - 2][0] < usage) {
				answer = fees[fees.length - 1][1];
				break;
			} else if (fees[i][0] == 0 && usage <= fees[i - 1][0]) {
				answer = fees[i - 1][1];
				break;
			}
		}
		System.out.println(answer);
		// 1번 index 더해놓기
		if (fees[0][0] < usage){
			answer += fees[0][0] * fees[0][2];
			temp += fees[0][0];
		}
		int diff = 0;

		for (int i = 1; i < fees.length; i++) {
			if (usage <= fees[i - 1][0]) {
				// 3번 케이스
				answer += (usage * fees[i - 1][2]);
				break;
			} else if (fees[i-1][0] < usage && usage <= fees[i][0]) {
				answer += ((fees[i][0] - fees[i - 1][0]) * fees[i][2]);
				temp += (fees[i][0] - fees[i - 1][0]);
			} else if (fees[i][0] == 0) {
				answer += ((usage - temp) * fees[i][2]);
				break;
			}else {
				answer += ((fees[i][0] - fees[i - 1][0]) * fees[i][2]);
				break;
			}
		}

//		for (int i = 1; i < fees.length; i++) {
//			if (fees[i][0] != 0) {
//				diff = 0;
//				diff = fees[i][0] - fees[i - 1][0];
//			} else {
//				temp = usage - fees[i - 1][0];
//			}
//			System.out.println(diff);
//			System.out.println(temp);
//			if (fees[i - 1][0] < diff && diff <= fees[i][0] ) {
//				answer += (diff * fees[i][2]);
//				temp += fees[i][0];
//			} else if (usage <= fees[i - 1][0]) {
//				temp += fees[i][0];
//				answer += (usage * fees[i - 1][2]);
//				break;
//			} else if (usage > fees[i - 1][0] && fees[i][0] == 0) {
//				answer += (temp * fees[i][2]);
//			}
//
//		}
		return answer;
	}

	public static void main(String[] args) {
		Problem1 T = new Problem1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] fees = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				fees[i][j] = kb.nextInt();
			}
		}
		int usage = kb.nextInt();

		System.out.println(T.solution(fees, usage));

	}
}
