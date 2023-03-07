package Chapter7;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS2 {
    int data;
    NodeBFS2 lt, rt;
    public NodeBFS2(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Problem8 {
    NodeBFS2 root;
    public int BFS(NodeBFS2 root) {
        Queue<NodeBFS2> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                NodeBFS2 cur = queue.poll();
                if (cur.lt == null && cur.rt == null)
                    return L;
                if (cur.lt != null)
                    queue.offer(cur.lt);
                if (cur.rt != null)
                    queue.offer(cur.rt);
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Problem8 T = new Problem8();
        T.root = new NodeBFS2(1);
        T.root.lt = new NodeBFS2(2);
        T.root.rt = new NodeBFS2(3);
        T.root.lt.lt = new NodeBFS2(4);
        T.root.lt.rt = new NodeBFS2(5);
        // 레벨, root 노드
        System.out.println(T.BFS(T.root));

        // 3번 노드의 레벨을 return 할 것이다.
    }
}
