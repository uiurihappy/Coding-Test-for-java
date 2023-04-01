package Programmers;

import java.util.*;

/** 신고 결과 받기 (카카오)
 * input1
4
muzi frodo apeach neo
5
muzi frodo
apeach frodo
frodo neo
muzi neo
apeach muzi
2
 * output1
 2 1 1 0
 * input2
2
con
ryan
4
ryan con
ryan con
ryan con
ryan con
3
 * output2
0 0
 */
public class AcceptByReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();


        for (String reportInfo : report) {
            // reporter : 신고자, reported: 신고 당한 사람
            String reporter = reportInfo.split(" ")[0];
            String reported = reportInfo.split(" ")[1];
            boolean flag = false;

            if (reporterInfoMap.containsKey(reporter)) {
                if (reporterInfoMap.get(reporter).contains(reported))
                    // 이미 신고한 유저가 또 신고한 경우
                    flag = true;
                else reporterInfoMap.get(reporter).add(reported);
            } else {
                reporterInfoMap.put(reporter, new HashSet<String>(){{
                    add(reported);
                }});
            }
            if (flag) {
                continue;
            } else if (reportedCountInfoMap.containsKey(reported)) {
                reportedCountInfoMap.put(reported, reportedCountInfoMap.get(reported)+1);
            } else {
                reportedCountInfoMap.put(reported, 1);
            }
        }

        for (String reported : reportedCountInfoMap.keySet()){
            int reportedCount = reportedCountInfoMap.get(reported);
            if (reportedCount >= k){
                // 메일 발송 대상
                for (int i = 0; i < id_list.length; i++){
                    if (reporterInfoMap.get(id_list[i]) == null){
                        answer[i] = 0;
                    } else if (reporterInfoMap.get(id_list[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AcceptByReport T = new AcceptByReport();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] id_list = new String[n];
        int r = kb.nextInt();
        String[] report  = new String[r];
        int k = kb.nextInt();


        for (int x : T.solution(id_list, report, k))
            System.out.print(x + " ");
    }
}
