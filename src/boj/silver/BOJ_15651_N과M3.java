package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15651_N과M3 {

    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        sb = new StringBuilder();

        DFS(0);
        System.out.println(sb);
    }

    public static void DFS(int depth) {
        if (depth==m) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=1; i<=n; i++) {
            arr[depth]=i;
            DFS(depth+1);
        }
    }
}