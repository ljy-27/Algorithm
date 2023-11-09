package algo.algorithm.Recursive_Tree_Graph;

import java.util.Scanner;

public class Path_Search {

    static int n, m, answer=0;
    static int[] check;
    static int[][] graph;

    public void DFS(int v){
        if (v==n){
            answer++;
        }else {
            for (int i=2; i<=n; i++){
                if (graph[v][i]==1 && check[i]!=1){
                    check[i]=1;
                    DFS(i);
                    check[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Path_Search T = new Path_Search();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        check = new int[n+1];
        graph = new int[n+1][n+1];
        for (int i=0; i<m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x][y] = 1;
        }
        check[1]=1;
        T.DFS(1);
        System.out.print(answer);
    }
}
