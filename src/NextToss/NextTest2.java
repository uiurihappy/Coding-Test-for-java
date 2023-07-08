package NextToss;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NextTest2 {

    private static int totalReward = 0;
    private static int newFriendsCount = 0;

    public static int solution(int[][] relationships, int target, int limit) {
        Map<Integer, List<Integer>> graph = buildGraph(relationships);
        boolean[] visited = new boolean[101];
        dfs(graph, visited, target, limit, 1);
        return totalReward + newFriendsCount;
    }

    private static Map<Integer, List<Integer>> buildGraph(int[][] relationships) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] relationship : relationships) {
            int person1 = relationship[0];
            int person2 = relationship[1];
            graph.putIfAbsent(person1, new ArrayList<>());
            graph.putIfAbsent(person2, new ArrayList<>());
            graph.get(person1).add(person2);
            graph.get(person2).add(person1);
        }
        return graph;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int person, int limit, int depth) {
        visited[person] = true;

        if (depth > limit) {
            return;
        }

        List<Integer> friends = graph.get(person);
        for (int friend : friends) {
            if (!visited[friend]) {
                visited[friend] = true;
                if (depth == 1) {
                    totalReward += 5;  // 원래 알고 있던 친구는 5원의 보상
                } else {
                    totalReward += 10;  // 새롭게 알게 된 친구는 10원의 보상
                    newFriendsCount++;
                }
                dfs(graph, visited, friend, limit, depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] relationships = {{1, 2}, {2, 3}, {2, 6}, {3, 4}, {4, 5}};
        int target = 2;
        int limit = 3;
        int result = solution(relationships, target, limit);
        System.out.println(result);  // 출력: 37
    }
}

