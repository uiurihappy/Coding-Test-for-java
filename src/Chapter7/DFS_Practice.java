package Chapter7;

/** 이진트리 순회 (깊이 우선 탐색)
 * 부모가 기준으로 우선 순위에 맞춰 탐색
 * 전위 순회: 부모부터 방문하고 왼쪽 -> 오른쪽 자식
 * 중위 순회: 왼쪽 자식부터 방문하고 부모 -> 오른쪽 자식
 * 후위 순회: 왼쪽 자식부터 방문하고 오른쪽 자식 -> 부모
 *
 */

class Node {
	int data;
	Node lt, rt;
	public Node (int val) {
		data = val;
		lt = rt = null;
	}
}

public class DFS_Practice {
	Node root;
	public void DFS (Node root) {

	}
	public static void main(String[] args) {
		DFS_Practice tree = new DFS_Practice();
		// 부모
		tree.root = new Node(1);

		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);

		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.lt.rt = new Node(7);


	}
}
