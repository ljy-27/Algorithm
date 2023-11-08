package algo.algorithm.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_BFS {
    Node root;
    public int BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()){
            int len = queue.size();

            for (int i=0; i<len; i++){
                Node cur = queue.poll();
                if (cur.lt==null && cur.rt==null) return L;
                if (cur.lt!=null) queue.offer(cur.lt);
                if (cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Shortest_Path_BFS T = new Shortest_Path_BFS();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.BFS(T.root));
    }
}
