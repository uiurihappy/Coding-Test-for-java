package Chapter7;

/** 이진트리 순회 (깊이 우선 탐색)
 * 부모가 기준으로 우선 순위에 맞춰 탐색
 * 전위 순회: 부모부터 방문하고 왼쪽 -> 오른쪽 자식
 * 중위 순회: 왼쪽 자식부터 방문하고 부모 -> 오른쪽 자식
 * 후위 순회: 왼쪽 자식부터 방문하고 오른쪽 자식 -> 부모
 *
 * 말단 노드의 값은 null
 */

class NodeDFS {
	int data;
	NodeDFS lt, rt;
	public NodeDFS (int val) {
		data = val;
		lt = rt = null;
	}
}

public class DFS_Practice {
	NodeDFS root;
	public void DFS (NodeDFS root, String orderKey) {

		// 말단 노드일 때,
		if (root == null) return;
		// 노드 data 값이 null 아닌 경우 key 따른 로직 실행
		else {
			switch (orderKey) {
				case "pre":
					// 전위 순회 (pre-order)
					System.out.print(root.data + " ");
					DFS(root.lt, orderKey);
					DFS(root.rt, orderKey);
					break;
				case "in":
					// 중위 순회 (in-order)
					DFS(root.lt, orderKey);
					System.out.print(root.data + " ");
					DFS(root.rt, orderKey);
					break;
				case "post":
					// 후위 순회 (post-order)
					DFS(root.lt, orderKey);
					DFS(root.rt, orderKey);
					System.out.print(root.data + " ");
					break;
				default:
					System.out.println("Not found orderKey!");
					break;
			}
		}

	}
	public static void main(String[] args) {
		DFS_Practice tree = new DFS_Practice();
		// 부모
		tree.root = new NodeDFS(1);

		tree.root.lt = new NodeDFS(2);
		tree.root.rt = new NodeDFS(3);

		tree.root.lt.lt = new NodeDFS(4);
		tree.root.lt.rt = new NodeDFS(5);
		tree.root.rt.lt = new NodeDFS(6);
		tree.root.rt.rt = new NodeDFS(7);
		String[] orderKey = {"pre", "in", "post"};
		for (String key : orderKey) {
			System.out.println(key + "-order");
			tree.DFS(tree.root, key);
			System.out.println();
		}
	}
}
