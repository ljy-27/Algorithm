package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649_N과M1 {

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

        DFS(0);
        System.out.println(sb);
    }

    public static void DFS(int depth) {
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=1; i<=n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                DFS(depth+1);
                visited[i] = false;
            }
        }
    }
}