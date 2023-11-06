package algo.algorithm.Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {
    Node root;
    public void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L=0;
        while (!queue.isEmpty()){
            int len = queue.size();

            for (int i=0; i<len; i++){
                Node cur = queue.poll();
                System.out.print(cur.data+ " ");
                if (cur.lt!=null) queue.offer(cur.lt);
                if (cur.rt!=null) queue.offer(cur.rt);
            }

            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Breadth_First_Search T = new Breadth_First_Search();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.BFS(T.root);
    }
}
