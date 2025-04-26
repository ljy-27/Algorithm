package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650_N과M2 {

    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visited = new boolean[n+1];
        sb = new StringBuilder();

        DFS(0,0);
        System.out.println(sb);
    }

    public static void DFS(int depth, int cur) {
        if (depth==m) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=1; i<=n; i++) {
            if (!visited[i] && i>cur) {
                arr[depth]=i;
                visited[i]=true;
                DFS(depth+1, i);
                visited[i]=false;
            }
        }
    }
}