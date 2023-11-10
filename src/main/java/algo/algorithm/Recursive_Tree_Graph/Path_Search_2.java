package algo.algorithm.Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Path_Search_2 {
    static int n,m,answer=0;
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph;
    public void DFS(int v){
        if (v==n){
            answer++;
        } else {
            for (int i : graph.get(v)) {
                if (check[i]!=1){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Path_Search_2 T = new Path_Search_2();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n+1];
        for (int i=0; i<m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
        }
        check[1]=1;
        T.DFS(1);
        System.out.print(answer);
    }
}
