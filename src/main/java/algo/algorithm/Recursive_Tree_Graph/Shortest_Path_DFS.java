package algo.algorithm.Recursive_Tree_Graph;

import javax.swing.*;

public class Shortest_Path_DFS {

    Node root;
    public int DFS(int L, Node root){
        if (root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        Shortest_Path_DFS T = new Shortest_Path_DFS();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.print(T.DFS(0, T.root));
    }
}
