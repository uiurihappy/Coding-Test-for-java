package yanolja;

import java.util.*;

/** Test 2
 * input1
 3
 3 1 2
 2 3 1
 * output1
 true
 * input2
 3
 1 2 1
 2 3 3
 * output2
 false
 * input3
 4
 1 2 3 4
 2 1 4 4
 * output3
 false
 * input4
 4
 1 2 3 4
 2 1 4 3
 * output4
 false
 * input5
 5
 1 2 2 3 3
 2 3 3 4 5
 * output5
 false
 */
public class Test2 {

	public boolean solution(int[] A, int[] B) {
		int N = A.length;

		// Create an adjacency list representation of the directed graph
		Map<Integer, List<Integer>> graph = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int from = A[i];
			int to = B[i];
			graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
		}

		// Helper function to perform DFS and detect cycles
		boolean[] visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			if (!visited[i] && hasCycle(graph, i, visited, new HashSet<>())) {
				return false;
			}
		}

		// If there are unvisited vertices, it means there are disconnected components
		// and it's not a cycle.
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				return false;
			}
		}

		return true;
	}

	private boolean hasCycle(Map<Integer, List<Integer>> graph, int current, boolean[] visited, Set<Integer> recursionStack) {
		if (recursionStack.contains(current)) {
			return true;
		}

		if (visited[current]) {
			return false;
		}

		visited[current] = true;
		recursionStack.add(current);

		List<Integer> neighbors = graph.get(current);
		if (neighbors != null) {
			for (int neighbor : neighbors) {
				if (!hasCycle(graph, neighbor, visited, recursionStack)) {
					return true;
				}
			}
		}

		recursionStack.remove(current);
		return false;
	}

	public static void main(String[] args) {
		Test2 T = new Test2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];

		for (int i = 0; i < n; i++)
			A[i] = kb.nextInt();
		for (int i = 0; i < n; i++)
			B[i] = kb.nextInt();

		System.out.println(T.solution(A, B));
	}
}
