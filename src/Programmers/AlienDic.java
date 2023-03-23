package Programmers;

import java.util.Scanner;

/** 외계어 사전
 * input1
3
p o s
5
sod eocd qixm adio soo
 * output1
 2
 * input2
3
z d x
4
def dww dzx loveaw
 * output2
 1
 * input3
4
s o m d
5
moos dzx smm sunmmo som
 * output3
 2
 */
public class AlienDic {

	public int solution(String[] spell, String[] dic) {
		int answer = 2;

		for (String s : dic) {
			boolean check = true;
			for (String value : spell) {
				if (!s.contains(value)) {
					check = false;
					break;
				}
			}
			if (check) {
				answer = 1;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		AlienDic T = new AlienDic();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] spell = new String[n];
		for(int i = 0; i < n; i++)
			spell[i] = kb.next();
		int m = kb.nextInt();
		String[] dic = new String[m];
		for(int i = 0; i < n; i++)
			dic[i] = kb.next();
		System.out.println(T.solution(spell, dic));
	}
}
