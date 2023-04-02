package Jobda;

import java.util.*;

public class DevPlayGround {

    public String[] solution(String[] history, String[][] option, String keyword) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < history.length; i++) {
            for (String[] op : option) {
                // 단어
                switch(op[0]) {
                    case "W":
                        if (op[1].equals("T")) {      // T
                            if (history[i].contains(keyword)) {
                                answer.add(history[i]);
                            }
                        }
                        break;
                    case "R":
                        if (op[1].equals("T")) {
                            for (int k = 0; k < answer.size(); k++)  {
                                String RStr = "";
                                if (answer.get(k).length() > 10) {
                                    RStr = answer.get(k).substring(0, 10);
                                    RStr += "...";
                                    // 순서 보장
                                    answer.set(k, RStr);
                                } else continue;
                            }
                        }
                        break;
                    case "WC":
                        if (op[1].equals("T")) {
                            String subKeyword = keyword.substring(0, keyword.length() - 2);
                            if (keyword.equals("*")) {
                                return history;
                            } else if (keyword.lastIndexOf("*") > 0 && history[i].contains(subKeyword)) {
                                answer.add(history[i]);
                            } else {
                                return new String[]{"empty"};
                            }
                        }
                        break;
                    default:
                        String[] str = history[i].split(" ");
                        if (op[1].equals("T")) {
                            if (keyword.equals(history[i])){
                                answer.add(history[i]);
                            }
                        }
                        break;
                }
            }
        }
        if (answer.isEmpty())
            return new String[]{"empty"};
        return answer.toArray(String[]::new);
    }

    public static void main(String[] args) {
        DevPlayGround T = new DevPlayGround();
        Scanner kb = new Scanner(System.in);

    }
}
