package algo.algorithm.Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_Shortest_Path {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, dis;
    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int cv = queue.poll();//current vertex
            for (int nv : graph.get(cv)) {//next vertex
                if (check[nv] == 0){
                    check[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph_Shortest_Path T = new Graph_Shortest_Path();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n+1];
        dis = new int[n+1];
        for (int i=0; i<m; i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            graph.get(x).add(y);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
