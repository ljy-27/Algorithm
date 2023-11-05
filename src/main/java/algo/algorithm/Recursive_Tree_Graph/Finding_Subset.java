package algo.algorithm.Recursive_Tree_Graph;

import java.util.Scanner;

public class Finding_Subset {

    static int n;
    static int[] check;

    public void DFS(int L){
        if (L==n+1){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=1; i<=n; i++){
                if (check[i]==1) stringBuilder.append(i).append(" ");
            }
            if (stringBuilder.length()>0) System.out.println(stringBuilder);
        } else {
            check[L]=1;
            DFS(L+1);
            check[L]=0;
            DFS(L+1);
        }
    }


    public static void main(String[] args) {
        Finding_Subset T = new Finding_Subset();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        check = new int[n + 1];
        T.DFS(1);
    }
}
