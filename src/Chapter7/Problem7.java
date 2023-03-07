package Chapter7;

class NodeDFS2 {
	int data;
	NodeDFS2 lt, rt;
	public NodeDFS2(int val) {
		data = val;
		lt = rt = null;
	}
}
public class Problem7 {
	NodeDFS2 root;
	public int DFS(int L, NodeDFS2 root) {
		if (root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}

	public static void main(String[] args) {
		Problem7 T = new Problem7();
		T.root = new NodeDFS2(1);
		T.root.lt = new NodeDFS2(2);
		T.root.rt = new NodeDFS2(3);
		T.root.lt.lt = new NodeDFS2(4);
		T.root.lt.rt = new NodeDFS2(5);
		// 레벨, root 노드
		System.out.println(T.DFS(0, T.root));

		// 3번 노드의 레벨을 return 할 것이다.
	}
}
