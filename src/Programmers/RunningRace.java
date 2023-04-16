package Programmers;

import java.util.*;
import java.util.stream.*;

/** 달리기 경주
 * input1
 5 4
 mumu soe poe kai mine
 kai kai mine mine
 * output1
 mumu kai mine soe poe
 */
public class RunningRace {

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerInfo = new HashMap<>();
        IntStream.range(0, players.length).forEach(index ->
        // 1번마, 2번마 ...
                playerInfo.put(players[index], index)
        );

//        System.out.println(playerInfo);

        Arrays.stream(callings).forEach(callPlayer -> {
            int idx = playerInfo.get(callPlayer);
            String frontPlayerName = players[idx - 1];
            players[idx] = frontPlayerName;
            players[idx - 1] = callPlayer;

            playerInfo.put(frontPlayerName, idx);
            playerInfo.put(callPlayer, idx - 1);
        });

        return players;
    }

    public static void main(String[] args) {
        RunningRace T = new RunningRace();
        Scanner kb = new Scanner(System.in);
        int p = kb.nextInt();
        int c = kb.nextInt();
        String[] players = new String[p];
        String[] callings = new String[c];
        for (int i = 0; i < p; i++)
            players[i] = kb.next();
        for (int i = 0; i < c; i++)
            callings[i] = kb.next();

        for (String x : T.solution(players, callings)) {
            System.out.print(x + " ");
        }
    }
}
